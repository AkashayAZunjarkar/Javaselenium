package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UseOfScrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		WebElement spcompanies = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",spcompanies);
		Thread.sleep(2000);
		WebElement myElement = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
		js.executeScript("arguments[0].scrollIntoView();", myElement);
		
		File src = myElement.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Testing\\sc1.png");
		FileHandler.copy(src, dest);
		
		
	}

}
