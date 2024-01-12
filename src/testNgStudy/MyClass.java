package testNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass 
{
  @Test
  public void a() 
  {
	  Reporter.log("a is running", true);
  }
  
  @Test
  public void b() 
  {
	  Assert.fail();
	  Reporter.log("b is running", true);
  }
  
  @Test(dependsOnMethods = {"b"})
  public void c() 
  {
	  Reporter.log("c is running", true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("d is running", true);
  }
}
