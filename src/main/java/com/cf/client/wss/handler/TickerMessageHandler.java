
package com.cf.client.wss.handler;

import com.cf.client.poloniex.wss.model.PoloniexWSSTicker;

public class TickerMessageHandler extends ATickerMessageHandler implements IMessageHandler {

  @Override
  public void process(PoloniexWSSTicker ticker) {
    System.out.println(ticker);
  }

}
