package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Studyxml2 
{
	@Test(groups={"Sanity,Regression"})
	  public void TC5() 
	  {
		  Reporter.log("TC 5 is running", true);  
	  }
	  
	  @Test(groups="Regression")
	  public void TC6() 
	  {
		  Reporter.log("TC 6 is running", true);  
	  }
	  
	  @Test(groups="Sanity")
	  public void TC7() 
	  {
		  Reporter.log("TC 7 is running", true);  
	  }
	  
	  @Test(groups="Sanity")
	  public void TC8() 
	  {
		  Reporter.log("TC 8 is running", true);  
	  }
}
