
package com.cf.client.wss.handler;

import com.cf.client.poloniex.wss.model.PoloniexWSSTicker;

public interface ITickerMessageHandler extends IMessageHandler {

  public void process(PoloniexWSSTicker ticker);

}
