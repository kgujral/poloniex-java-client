
package com.cf.client.wss.handler;

/**
 *
 * @author David
 */
public class LoggerMessageHandler implements IMessageHandler {

  @Override
  public void handle(String message) {
    System.out.println(message);
  }

}
