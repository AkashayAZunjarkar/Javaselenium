package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyDynamicWebTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        String text1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[1]")).getText();
        System.out.println(text1);
        
        List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
        
        System.out.println("===========================================================");
        for(WebElement th:tableHeader)
        {
        	System.out.println(th.getText()+" ");
        }
        System.out.println();
        
        System.out.println("===========================================================");
        
        WebElement singleElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[2]"));
        System.out.println(singleElement.getText());
        
        System.out.println("===========================================================");
        
        List<WebElement> row3 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td"));
        for(WebElement r:row3)
        {
        	System.out.println(r.getText()+" ");
        }
        System.out.println();
        
        System.out.println("===========================================================");
        
        for(int i=2;i<=7;i++)
        {
        	WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
        	System.out.println(data.getText());
        }
        
        System.out.println("==========================================================="); 
        
	}

}
