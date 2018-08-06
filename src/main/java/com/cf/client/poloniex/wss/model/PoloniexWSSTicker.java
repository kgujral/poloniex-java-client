
package com.cf.client.poloniex.wss.model;

import java.math.BigDecimal;
import com.google.gson.Gson;

/**
 *
 * @author David
 */
public class PoloniexWSSTicker {

  public String currencyString;

  public Double currencyPair;

  public BigDecimal lastPrice;

  public BigDecimal lowestAsk;

  public BigDecimal highestBid;

  public BigDecimal percentChange;

  public BigDecimal baseVolume;

  public BigDecimal quoteVolume;

  public Boolean isFrozen;

  public BigDecimal twentyFourHourHigh;

  public BigDecimal twentyFourHourLow;

  public PoloniexWSSTicker(String currencyString, Double currencyPair, BigDecimal lastPrice, BigDecimal lowestAsk,
      BigDecimal highestBid, BigDecimal percentChange, BigDecimal baseVolume, BigDecimal quoteVolume, Boolean isFrozen,
      BigDecimal twentyFourHourHigh, BigDecimal twentyFourHourLow) {
    this.currencyString = currencyString;
    this.currencyPair = currencyPair;
    this.lastPrice = lastPrice;
    this.lowestAsk = lowestAsk;
    this.highestBid = highestBid;
    this.percentChange = percentChange;
    this.baseVolume = baseVolume;
    this.quoteVolume = quoteVolume;
    this.isFrozen = isFrozen;
    this.twentyFourHourHigh = twentyFourHourHigh;
    this.twentyFourHourLow = twentyFourHourLow;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }

  public static class PoloniexWSSTickerBuilder {

    private String currencyString;

    private Double currencyPair;

    private BigDecimal lastPrice;

    private BigDecimal lowestAsk;

    private BigDecimal highestBid;

    private BigDecimal percentChange;

    private BigDecimal baseVolume;

    private BigDecimal quoteVolume;

    private Boolean isFrozen;

    private BigDecimal twentyFourHourHigh;

    private BigDecimal twentyFourHourLow;

    public PoloniexWSSTickerBuilder() {
    }

    public PoloniexWSSTickerBuilder setCurrencyString(String currencyString) {
      this.currencyString = currencyString;
      return this;
    }

    public PoloniexWSSTickerBuilder setCurrencyPair(Double currencyPair) {
      this.currencyPair = currencyPair;
      return this;
    }

    public PoloniexWSSTickerBuilder setLastPrice(BigDecimal lastPrice) {
      this.lastPrice = lastPrice;
      return this;
    }

    public PoloniexWSSTickerBuilder setLowestAsk(BigDecimal lowestAsk) {
      this.lowestAsk = lowestAsk;
      return this;
    }

    public PoloniexWSSTickerBuilder setHighestBid(BigDecimal highestBid) {
      this.highestBid = highestBid;
      return this;
    }

    public PoloniexWSSTickerBuilder setPercentChange(BigDecimal percentChange) {
      this.percentChange = percentChange;
      return this;
    }

    public PoloniexWSSTickerBuilder setBaseVolume(BigDecimal baseVolume) {
      this.baseVolume = baseVolume;
      return this;
    }

    public PoloniexWSSTickerBuilder setQuoteVolume(BigDecimal quoteVolume) {
      this.quoteVolume = quoteVolume;
      return this;
    }

    public PoloniexWSSTickerBuilder setIsFrozen(Boolean isFrozen) {
      this.isFrozen = isFrozen;
      return this;
    }

    public PoloniexWSSTickerBuilder setTwentyFourHourHigh(BigDecimal twentyFourHourHigh) {
      this.twentyFourHourHigh = twentyFourHourHigh;
      return this;
    }

    public PoloniexWSSTickerBuilder setTwentyFourHourLow(BigDecimal twentyFourHourLow) {
      this.twentyFourHourLow = twentyFourHourLow;
      return this;
    }

    public PoloniexWSSTicker buildPoloniexTicker() {
      return new PoloniexWSSTicker(currencyString, currencyPair, lastPrice, lowestAsk, highestBid, percentChange,
          baseVolume, quoteVolume, isFrozen, twentyFourHourHigh, twentyFourHourLow);
    }
  }

  public String getCurrencyString() {
    return currencyString;
  }

  public Double getCurrencyPair() {
    return currencyPair;
  }

  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public BigDecimal getLowestAsk() {
    return lowestAsk;
  }

  public BigDecimal getHighestBid() {
    return highestBid;
  }

  public BigDecimal getPercentChange() {
    return percentChange;
  }

  public BigDecimal getBaseVolume() {
    return baseVolume;
  }

  public BigDecimal getQuoteVolume() {
    return quoteVolume;
  }

  public Boolean getIsFrozen() {
    return isFrozen;
  }

  public BigDecimal getTwentyFourHourHigh() {
    return twentyFourHourHigh;
  }

  public BigDecimal getTwentyFourHourLow() {
    return twentyFourHourLow;
  }

}
