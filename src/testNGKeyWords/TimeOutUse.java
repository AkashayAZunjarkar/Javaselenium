package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse 
{
  @Test(timeOut = 5000)
  public void payment() throws InterruptedException 
  {
	  Thread.sleep(4000);
	  Reporter.log("Payment done successfully", true);
  }
}
