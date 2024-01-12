package sizeandPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
	    Point defaultPosition = driver.manage().window().getPosition();
	    System.out.println(defaultPosition);
	    
	    Point p = new Point(300, 200);
	    Thread.sleep(2000);
	    driver.manage().window().setPosition(p);
	    
	    Point p1 = new Point(-200, 300);
	    Thread.sleep(2000);
	    driver.manage().window().setPosition(p1);
	}

}
