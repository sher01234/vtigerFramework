package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage 
   {
	
	//intialization
    public CampaignsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
    
   //declaration
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
   private WebElement PlusButtontoCampaign;
	
	
	//getters method
   public WebElement getPlusButtontoCampaign() {
		return PlusButtontoCampaign;
	}
   
   public void Campaign()
   {
	   PlusButtontoCampaign.click();
   }
	
	
	
   
	
	
   }
