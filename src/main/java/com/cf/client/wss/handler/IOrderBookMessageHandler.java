
package com.cf.client.wss.handler;

import java.util.List;
import com.cf.client.poloniex.wss.model.PoloniexBook;
import com.cf.client.poloniex.wss.model.PoloniexWSSOrderBook;

public interface IOrderBookMessageHandler extends IMessageHandler {

  public void process(List<PoloniexWSSOrderBook> books);

  public void init(PoloniexBook book);

}
