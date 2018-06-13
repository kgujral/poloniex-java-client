
package com.cf.client.poloniex.wss.model;

import java.util.List;

public class PoloniexBook {

  private List<BookEntry> sell;

  private List<BookEntry> buy;

  private String currencyPair;

  public PoloniexBook() {
  }

  public PoloniexBook(List<BookEntry> sell, List<BookEntry> buy) {
    super();
    this.sell = sell;
    this.buy = buy;
  }

  public List<BookEntry> getSell() {
    return sell;
  }

  public void setSell(List<BookEntry> sell) {
    this.sell = sell;
  }

  public List<BookEntry> getBuy() {
    return buy;
  }

  public void setBuy(List<BookEntry> buy) {
    this.buy = buy;
  }

  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }

  @Override
  public String toString() {
    return "PoloniexBook [sell=" + sell + ", buy=" + buy + ", currencyPair=" + currencyPair + "]";
  }

}
