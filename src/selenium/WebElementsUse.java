package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//input[@value='1']"));
	boolean result=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	Thread.sleep(1000);
	System.out.println("gender selection status is "+result);
	Thread.sleep(1000);
	  
	element.click();//code optimization
	Thread.sleep(1000);
	boolean result1=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	Thread.sleep(1000);
	System.out.println("gender selection status is "+result1);
	}

}
