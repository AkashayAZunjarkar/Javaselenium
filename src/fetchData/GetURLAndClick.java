package fetchData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLAndClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement data = driver.findElement(By.className("pd-dp"));
		data.click();
		
		Thread.sleep(1000);
		
        driver.findElement(By.xpath("(//label[text()='Sign'])[1]")).click();
        
	}

}
