package testNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseAssertionInNormalWay 
{
  @Test
  public void validateFBGenderCheckBox() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(2000);
	  boolean radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	  
	  //if female gender radio button is selected then the TC is passed else TC is failed
	  System.out.println("Female radio button status is "+radioButton);
	  
//	  if(radioButton)
//	  {
//		  System.out.println("Radio button is selected, TC is passed");
//		  
//	  }
//	  else
//	  {
//		  System.out.println("Radio button is not selected, TC is failed");		  
//	  }
	  
	  Assert.assertTrue(radioButton,"TC is failed, radio button is not selected");
  }
}
