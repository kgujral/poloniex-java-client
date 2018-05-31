
package com.cf.example;

import java.util.List;
import com.cf.client.poloniex.wss.model.PoloniexWSSOrderBook;
import com.cf.client.wss.handler.AOrderBookMessageHandler;
import com.cf.client.wss.handler.IOrderBookMessageHandler;

public class SampleOrderBookMessageHandler extends AOrderBookMessageHandler implements IOrderBookMessageHandler {

  @Override
  public void process(List<PoloniexWSSOrderBook> books) {
    System.out.println(books);
  }

}
