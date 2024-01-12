package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Use_Of_Before_Method 
{
  @Test
  public void Method1() 
  {
	  Reporter.log("Method 1", true);
  }
  
  @Test
  public void Method2()
  {
	  Reporter.log("Method 2", true);
  }
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Login is done", true);
  }
  
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("Logout is done", true);
  }
  
}
