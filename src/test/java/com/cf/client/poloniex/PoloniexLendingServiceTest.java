
package com.cf.client.poloniex;

import java.math.BigDecimal;
import org.junit.Test;

/**
 *
 * @author cheolhee
 */
public class PoloniexLendingServiceTest {

  static final String apiKey = "YOUR_API_KEY";

  static final String apiSecret = "YOUR_API_SECRET";

  String res = "";

  BigDecimal sum = BigDecimal.ZERO;

  PoloniexLendingService service = new PoloniexLendingService(apiKey, apiSecret);

  @Test
  public void returnActiveLoans() throws Exception {
  }

  @Test
  public void returnLendingHistory() throws Exception {
  }

  @Test
  public void createLoanOffer() throws Exception {
  }

  @Test
  public void cancelLoanOffer() throws Exception {
  }

  @Test
  public void returnOpenLoanOffers() throws Exception {
  }

  @Test
  public void toggleAutoRenew() throws Exception {
  }

}
