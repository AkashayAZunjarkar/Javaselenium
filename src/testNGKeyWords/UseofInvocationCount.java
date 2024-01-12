package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseofInvocationCount {
  @Test(invocationCount = 3)
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  
  @Test
  public void b()
  {
	  Reporter.log("TC b is running", true);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("TC c is running", true);
  }
}
