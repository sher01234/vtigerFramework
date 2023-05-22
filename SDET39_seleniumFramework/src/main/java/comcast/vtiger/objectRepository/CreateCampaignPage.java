package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage
    {
    //initialization
	public CreateCampaignPage(WebDriver driver)
    
    {
    	
	PageFactory.initElements(driver, this);
    
    }
	//declaration
	@FindBy(name="campaignname")
	private WebElement CampaignNameTextField;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement SaveButtton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	   private WebElement producplustinsidecamp;
	
	 //getters method

	public WebElement getCampaignNameTextField() {
		return CampaignNameTextField;
	}

	public WebElement getProducplustinsidecamp() {
		return producplustinsidecamp;
	}

	public WebElement getSaveButtton() {
		return SaveButtton;
	}
	//buisness logic
	/**
	 * @author sher
	 */
    
    public void createcampaignpage(String campaignName) 
    {
    	CampaignNameTextField.sendKeys(campaignName);
    	
    }
    
    public void savecampaign() 
    {
    	SaveButtton.click();
    }
    //buisnesslogic
    /**
     * @author sher
     */
public void productplusincampaign() 
{
	producplustinsidecamp.click();
}


    }
  