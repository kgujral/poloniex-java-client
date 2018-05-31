
package com.cf.client.wss.handler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.cf.client.poloniex.wss.model.OrderType;
import com.cf.client.poloniex.wss.model.PoloniexWSSOrderBook;
import com.google.gson.Gson;

/**
 *
 * @author David
 */
public class LoggerMessageHandler implements IMessageHandler {

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
      books.add(createBook((Double) results.get(0), BigDecimal.valueOf((Double) results.get(1)), order));
    }
    System.out.println(books);
  }

  @SuppressWarnings("rawtypes")
  private PoloniexWSSOrderBook createBook(Double currencyPair, BigDecimal seqNo, List order) {
    String orderType = (String) order.get(0);
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

}
