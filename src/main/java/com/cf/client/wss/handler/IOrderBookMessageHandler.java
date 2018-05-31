
package com.cf.client.wss.handler;

import java.util.List;
import com.cf.client.poloniex.wss.model.PoloniexWSSOrderBook;

/**
 *
 * @author David
 */
public interface IOrderBookMessageHandler extends IMessageHandler {

  public void process(List<PoloniexWSSOrderBook> books);

}
