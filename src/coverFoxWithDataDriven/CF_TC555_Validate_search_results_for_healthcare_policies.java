package coverFoxWithDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CF_TC555_Validate_search_results_for_healthcare_policies {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream myfile = new FileInputStream("E:\\Testing\\Automation Testing\\Test Data.xlsx");
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("CoverFox");
        String ageData = mysheet.getRow(0).getCell(0).getStringCellValue();
        String pinCodeData = mysheet.getRow(0).getCell(1).getStringCellValue();
        String mobNumData = mysheet.getRow(0).getCell(2).getStringCellValue();
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
		memberDetails.handleAgeDropDown(ageData);
		memberDetails.clickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetails = new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(1000);
		addressDetails.enterPinCode(pinCodeData);
		addressDetails.enterMobileNum(mobNumData);
		addressDetails.ClickOnContinueButton();
		
		CoverFoxHealthPlanResultPage planResults = new CoverFoxHealthPlanResultPage(driver);
		Thread.sleep(7000);
		planResults.validatePlanListWithResult();
		Thread.sleep(3000);
		//driver.close();
	}
}
