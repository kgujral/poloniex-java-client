
package com.cf.client.poloniex.wss.model;

import java.math.BigDecimal;
import java.util.TreeMap;

public class PoloniexBook {

  private TreeMap<BigDecimal, BigDecimal> sell;

  private TreeMap<BigDecimal, BigDecimal> buy;

  private String currencyPair;

  private BigDecimal latestSeqNo;

  public PoloniexBook() {
  }

  public PoloniexBook(TreeMap<BigDecimal, BigDecimal> sell, TreeMap<BigDecimal, BigDecimal> buy) {
    super();
    this.sell = sell;
    this.buy = buy;
  }

  public TreeMap<BigDecimal, BigDecimal> getSell() {
    return sell;
  }

  public void setSell(TreeMap<BigDecimal, BigDecimal> sell) {
    this.sell = sell;
  }

  public TreeMap<BigDecimal, BigDecimal> getBuy() {
    return buy;
  }

  public void setBuy(TreeMap<BigDecimal, BigDecimal> buy) {
    this.buy = buy;
  }

  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }

  public BigDecimal getLatestSeqNo() {
    return latestSeqNo;
  }

  public void setLatestSeqNo(BigDecimal latestSeqNo) {
    this.latestSeqNo = latestSeqNo;
  }

  @Override
  public String toString() {
    return "PoloniexBook [sell=" + sell + ", buy=" + buy + ", currencyPair=" + currencyPair + ", latestSeqNo="
        + latestSeqNo + "]";
  }

}
