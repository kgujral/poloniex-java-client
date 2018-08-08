
package com.cf.client.wss.handler;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import com.cf.client.poloniex.wss.model.OrderType;
import com.cf.client.poloniex.wss.model.PoloniexBook;
import com.cf.client.poloniex.wss.model.PoloniexTrade;
import com.cf.client.poloniex.wss.model.PoloniexWSSOrderBook;
import com.google.gson.Gson;

/**
 *
 * @author Karan
 */
public abstract class AOrderBookMessageHandler implements IOrderBookMessageHandler {

  private final static Gson GSON = new Gson();

  @SuppressWarnings({
      "rawtypes", "unchecked"
  })
  @Override
  public void handle(String message) {
    List results = GSON.fromJson(message, List.class);
    if (results == null || results.size() < 3) {
      return;
    }
    List<PoloniexWSSOrderBook> books = new ArrayList<>();
    List<List> orders = (List<List>) results.get(2);
    for (List order : orders) {
      PoloniexWSSOrderBook book = createBook((Double) results.get(0), BigDecimal.valueOf((Double) results.get(1)),
          order);
      if (book != null) {
        books.add(book);
      }
    }
    if (!books.isEmpty()) {
      process(books);
    }
  }

  @SuppressWarnings("rawtypes")
  private PoloniexWSSOrderBook createBook(Double currencyPair, BigDecimal seqNo, List order) {
    String orderType = (String) order.get(0);
    if (orderType.equals("i")) {
      init(order);
    }
    if (orderType.equals("t")) {
      trade(order, currencyPair);
    }
    if (!orderType.equals("o")) {
      return null;
    }
    OrderType type = OrderType.getOrderType((String) order.get(0), (Double) order.get(1));
    if (type == null) {
      return null;
    }
    PoloniexWSSOrderBook book = new PoloniexWSSOrderBook();
    book.setCurrencyPair(currencyPair);
    book.setSequenceNumber(seqNo);
    book.setType(type);
    book.setRate(new BigDecimal((String) order.get(2)));
    book.setAmount(new BigDecimal((String) order.get(3)));
    return book;
  }

  @SuppressWarnings("rawtypes")
  private void trade(List order, Double currencyPair) {
    System.out.println(order);
    OrderType type = OrderType.getOrderType((String) order.get(0), (Double) order.get(2));
    if (type != null) {
      PoloniexTrade trade = new PoloniexTrade(currencyPair, (String) order.get(1), type,
          new BigDecimal((String) order.get(3)), new BigDecimal((String) order.get(4)),
          new Date(((Double) order.get(5)).longValue() * 1000));

      trade(trade);
    }
  }

  @SuppressWarnings("rawtypes")
  private void init(List initData) {
    String string = initData.get(1).toString().replace("=", ":");
    Map map = GSON.fromJson(string, Map.class);

    Map sellMap = (Map) ((List) map.get("orderBook")).get(0);
    Map buyMap = (Map) ((List) map.get("orderBook")).get(1);

    TreeMap<BigDecimal, BigDecimal> sells = new TreeMap<BigDecimal, BigDecimal>();
    TreeMap<BigDecimal, BigDecimal> buys = new TreeMap<BigDecimal, BigDecimal>();
    bookEntries(sellMap, sells);
    bookEntries(buyMap, buys);
    PoloniexBook book = new PoloniexBook(sells, buys);
    init(book);
  }

  @SuppressWarnings("rawtypes")
  private void bookEntries(Map map, TreeMap<BigDecimal, BigDecimal> entries) {
    for (Object sellRate : map.keySet()) {
      BigDecimal rate = new BigDecimal(sellRate.toString()).setScale(8, RoundingMode.CEILING);
      BigDecimal amount = new BigDecimal(map.get(sellRate).toString());
      if (amount.equals(BigDecimal.ZERO)) {
        entries.remove(rate);
      } else {
        entries.put(rate, amount);
      }
    }
  }

  @Override
  public void init(PoloniexBook book) {
    System.out.println(book);
  }

}
