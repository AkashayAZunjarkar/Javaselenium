package coverFoxUsingPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_search_results_for_healthcare_policies {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		CoverFoxHomePage home = new CoverFoxHomePage(driver);
		Thread.sleep(500);
		home.clickOnFemaleButton();
		
		CoverFoxHealthPlanPage healthPlan = new CoverFoxHealthPlanPage(driver);
		Thread.sleep(500);
		healthPlan.clickOnNextButton();
		
		CoverFoxMemberDetailsPage memberDetails = new CoverFoxMemberDetailsPage(driver);
		Thread.sleep(500);
		memberDetails.handleAgeDropDown();
		memberDetails.clickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetails = new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(1000);
		addressDetails.enterPinCode();
		addressDetails.enterMobileNum();
		addressDetails.ClickOnContinueButton();
		
		CoverFoxHealthPlanResultPage planResults = new CoverFoxHealthPlanResultPage(driver);
		Thread.sleep(7000);
		planResults.validatePlanListWithResult();
		Thread.sleep(2000);
		//driver.close();
	}

}
