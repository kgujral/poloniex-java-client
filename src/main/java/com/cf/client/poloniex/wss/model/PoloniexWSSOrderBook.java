
package com.cf.client.poloniex.wss.model;

import java.math.BigDecimal;

public class PoloniexWSSOrderBook {

  private Double currencyPair;

  private BigDecimal sequenceNumber;

  private OrderType type;

  private BigDecimal rate;

  private BigDecimal amount;

  public Double getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(Double currencyPair) {
    this.currencyPair = currencyPair;
  }

  public BigDecimal getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(BigDecimal sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public OrderType getType() {
    return type;
  }

  public void setType(OrderType type) {
    this.type = type;
  }

  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "currencyPair=" + currencyPair + ", seqNo=" + sequenceNumber.toPlainString() + ", type=" + type + ", rate="
        + rate.toPlainString() + ", amount=" + amount.toPlainString();
  }
}
