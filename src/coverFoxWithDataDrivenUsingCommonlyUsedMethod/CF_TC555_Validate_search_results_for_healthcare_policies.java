package coverFoxWithDataDrivenUsingCommonlyUsedMethod;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonlyUsedmethods.CommonMethods;

public class CF_TC555_Validate_search_results_for_healthcare_policies {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
        
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFoxHomePage home = new CoverFoxHomePage(driver);
		Thread.sleep(500);
		home.clickOnFemaleButton();
		
		CoverFoxHealthPlanPage healthPlan = new CoverFoxHealthPlanPage(driver);
		Thread.sleep(500);
		healthPlan.clickOnNextButton();
		
		CoverFoxMemberDetailsPage memberDetails = new CoverFoxMemberDetailsPage(driver);
		Thread.sleep(500);
		memberDetails.handleAgeDropDown(CommonMethods.readDataFromExcel(0,0));
		memberDetails.clickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetails = new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(1000);
		addressDetails.enterPinCode(CommonMethods.readDataFromExcel(0, 1));
		addressDetails.enterMobileNum(CommonMethods.readDataFromExcel(0, 2));
		addressDetails.ClickOnContinueButton();
		
		CoverFoxHealthPlanResultPage planResults = new CoverFoxHealthPlanResultPage(driver);
		Thread.sleep(7000);
		planResults.validatePlanListWithResult();
		Thread.sleep(3000);
		//driver.close();
	}
}
