
package com.cf.client.poloniex.wss.model;

import java.math.BigDecimal;
import java.util.Date;

public class PoloniexTrade {

  private Double currencyPair;

  private String tradeId;

  private OrderType type;

  private BigDecimal price;

  private BigDecimal amount;

  private Date date;

  public PoloniexTrade() {
  }

  public Double getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(Double currencyPair) {
    this.currencyPair = currencyPair;
  }

  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  public OrderType getType() {
    return type;
  }

  public void setType(OrderType type) {
    this.type = type;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public PoloniexTrade(Double currencyPair, String tradeId, OrderType type, BigDecimal price, BigDecimal amount,
      Date date) {
    super();
    this.currencyPair = currencyPair;
    this.tradeId = tradeId;
    this.type = type;
    this.price = price;
    this.amount = amount;
    this.date = date;
  }

  @Override
  public String toString() {
    return "PoloniexTrade [currencyPair=" + currencyPair + ", tradeId=" + tradeId + ", type=" + type + ", price="
        + price + ", amount=" + amount + ", date=" + date + "]";
  }

}
