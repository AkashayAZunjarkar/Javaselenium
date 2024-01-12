package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxHandlingUse {

	public static void main(String[] args) throws InterruptedException 
	{
		// List Box / Dropdown handling
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
        //driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.partialLinkText("new account")).click();
	}

}
