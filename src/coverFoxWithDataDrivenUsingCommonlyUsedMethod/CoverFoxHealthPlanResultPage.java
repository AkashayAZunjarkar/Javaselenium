package coverFoxWithDataDrivenUsingCommonlyUsedMethod;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanResultPage 
{
	@FindBy(xpath = "//div[contains(text(),'matching Health')]") private WebElement resultInString;
	   @FindBy(id = "plans-list") private List<WebElement> planList;
	   
	   public CoverFoxHealthPlanResultPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void validatePlanListWithResult()
	   {
		   String test = resultInString.getText();//49 matching health insurance plans
		   String ar[] = test.split(" ");
		   String numberOfResultsInString = ar[0];
		   
		   //convert string to integer
		   
		   int numberOfResultInInt = Integer.parseInt(numberOfResultsInString);	   
		   
		   int totalNoOfPlans = planList.size();
		   
		   if(totalNoOfPlans == numberOfResultInInt)
		   {
			   System.out.println("Plans no. matching with plans list, TC is passed");
		   }
		   else
		   {
			   System.out.println("Plans no. is not matching with plans list, TC is failed");
		   }  
	   }
}
