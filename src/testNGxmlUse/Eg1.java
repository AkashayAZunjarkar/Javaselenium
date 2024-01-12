package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)

public class Eg1 
{
  @Test
  public void TC1() 
  {
	  Reporter.log("TC 1 is running", true);  
  }
  
  @Test
  public void TC2() 
  {
	  //Assert.fail();
	  Reporter.log("TC 2 is running", true);  
  }
  
  @Test(dependsOnMethods = {"TC2"})
  public void TC3() 
  {
	  //Assert.fail();
	  Reporter.log("TC 3 is running", true);  
  }
  
  @Test
  public void TC4() 
  {
	  //Assert.fail();
	  Reporter.log("TC 4 is running", true);  
  }
  
  @Test
  public void TC5() 
  {
	  //Assert.fail();
	  Reporter.log("TC 5 is running", true);  
  }
}
