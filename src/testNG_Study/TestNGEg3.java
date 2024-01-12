package testNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGEg3 
{
  @Test
  public void fbLaunch() 
  { 
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Reporter.log("FB Launching", true);
  }
  
  @Test
  public void AmazonLaunch()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  Reporter.log("Amazon Launching", true);
  }
  
  @Test
  public void twitterLaunch()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://twitter.com/i/flow/login");
	  Reporter.log("Twitter Launching", true);
  }
  
}
