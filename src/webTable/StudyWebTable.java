package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyWebTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("BookTable"));
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int numberOfRows = rows.size();
        
        System.out.println("Number of rows in table are"+numberOfRows);
        
        List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
        
        int numberOfColumns = headers.size();
        
        System.out.println("Number of columns in table are"+numberOfColumns);    
        
	}

}
