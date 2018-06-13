
package com.cf.client.poloniex.wss.model;

import java.math.BigDecimal;

public class BookEntry {

  private BigDecimal rate;

  private BigDecimal amount;

  public BookEntry() {
  }

  public BookEntry(BigDecimal rate, BigDecimal amount) {
    super();
    this.rate = rate;
    this.amount = amount;
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
    return "BookEntry [rate=" + rate + ", amount=" + amount + "]";
  }

}
