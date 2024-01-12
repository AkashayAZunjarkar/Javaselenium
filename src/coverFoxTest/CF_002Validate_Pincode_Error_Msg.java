
package coverFoxTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDeatilsPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxUtility.Utility;

@Listeners(listeners.Listener.class)
public class CF_002Validate_Pincode_Error_Msg extends Base
{
	
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDeatilsPage addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException 
	{
		launchCoverFox();
		home = new CoverFoxHomePage(driver);
		healthPlan = new CoverFoxHealthPlanPage(driver);
		addressDetails = new CoverFoxAddressDeatilsPage(driver);
		memberDetails = new CoverFoxMemberDetailsPage(driver);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@BeforeMethod
	public void enterUserDetails() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		home.clickOnFemaleButton();
		Thread.sleep(1000);
		healthPlan.clickOnNextButton();
		Thread.sleep(1000);
		memberDetails.handleAgeDropDown(Utility.readDataFromExcel(0, 0));
		memberDetails.clickOnNextButton();
		Thread.sleep(1000);
		addressDetails.enterMobileNum(Utility.readDataFromExcel(0, 1));
		addressDetails.ClickOnContinueButton();
		Thread.sleep(1000);
		
	}
	
  @Test
  public void validate_Pincode_ErrorMsg() 
  {
	 Reporter.log("Validating Pincode Error Msg", true);
	 boolean result = addressDetails.ValidatePinErrorMsg();
	 Assert.assertTrue(result,"Pincode Error Msg Is Not Displayed,So TC Is Failled");
	 Reporter.log("TC IS Passed", true);
	  
  }
  
  @AfterMethod
  public void closeBrowser() throws InterruptedException 
  {
	  Reporter.log("Closing Browser", true);
	  Thread.sleep(5000);
	//closeCoverFox();
	 
  }
}
