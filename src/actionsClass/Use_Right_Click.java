package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Use_Right_Click {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		
		WebElement rightClickButton = driver.findElement(By.xpath("//input[@type='password']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClickButton).perform();
	}

}
