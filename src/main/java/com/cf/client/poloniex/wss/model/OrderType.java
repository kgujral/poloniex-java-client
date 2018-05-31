
package com.cf.client.poloniex.wss.model;

public enum OrderType {

  BUY, SELL;

  public static OrderType getOrderType(String prefix, Double i) {
    if ("o".equals(prefix)) {
      return i == 0 ? SELL : BUY;
    }
    return null;
  }

}
