package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class HomePage {
//initialization
	public HomePage(WebDriver driver) 
	{
		
	PageFactory.initElements(driver,this);	
	}
	//declaration
	@FindBy(xpath="//a[text()='Products']")
     private	WebElement ProductModuleButton;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement OrganizationModuleButton;
	
	@FindBy(linkText ="More")
	private WebElement MoreButtonMouseHour;
	
	@FindBy(name="Campaigns")
			private WebElement CampaignModuleButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement SignOutMouseButton;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlinktext;
//getters method
	public WebElement getProductModuleButton() 
	{
		return ProductModuleButton;
	
	}

	public WebElement getOrganizationModuleButton() 
	{
		return OrganizationModuleButton;
	
	}

	public WebElement getMoreButtonMousrHour() 
	{
		return MoreButtonMouseHour;
	
	}

	public WebElement getCampaignModuleButton() 
	{
		return CampaignModuleButton;
	
	}

	public WebElement getSignOutMouseButton() 
	{
		return SignOutMouseButton;
	
	}
	
      public WebElement getSignoutlinktext() {
		return signoutlinktext;
	}
    //buisness logic
      /**
       * @author sher
       */
	public void moreButtonmodule()
	{
		MoreButtonMouseHour.click();
	}
    //buisness logic
	/**
     * @author sher
     */
	public void productModule() 
	{
		ProductModuleButton.click();
		
	}
	//buisness logic
	/**
	 * @author sher
	 */
	public void organizationModule() 
	{
		OrganizationModuleButton.click();
	}
	//buisness logic
	/**
	 * @author sher
	 */
	public void campaignModule() 
	{
	
	    CampaignModuleButton.click();
	}  
	//buisness logic
	/**
	 * 
	 * @param driver
	 * @author sher
	 */
	
	public void signoutModule() 
	{
		
		signoutlinktext.click();
	}	
	
	
    }
