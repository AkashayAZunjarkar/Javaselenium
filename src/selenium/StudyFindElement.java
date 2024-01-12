package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyFindElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Use of Find Element Method
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");		
	    
		driver.findElement(By.xpath("//title[@id='register_Layer']")).click();
			
		
	}
}
