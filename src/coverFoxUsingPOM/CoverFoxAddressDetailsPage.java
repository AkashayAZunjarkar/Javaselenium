package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage 
{
   @FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pinCode;
   @FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNum;
   @FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;

   public CoverFoxAddressDetailsPage(WebDriver driver)
   {
	  PageFactory.initElements(driver, this);
   }

   public void enterPinCode()
   {
	  pinCode.sendKeys("440023");
   }

   public void enterMobileNum()
   {
	  mobNum.sendKeys("9112644706");
   }

   public void ClickOnContinueButton()
   {
	  continueButton.click();
   }

}
