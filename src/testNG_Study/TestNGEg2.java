package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGEg2 
{
  @Test
  public void Sample2() 
  { 
	  System.out.println("Welcome to TestNG Class");
	  Reporter.log("Hi this is Reporter, without boolean parameter");
	  Reporter.log("Hi this is Reporter, with boolean parameter", true);
  }
}
