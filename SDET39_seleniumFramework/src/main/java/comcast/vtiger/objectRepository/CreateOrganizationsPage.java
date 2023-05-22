package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationsPage 
{
	//intializations
		public  CreateOrganizationsPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//declaration
		
		@FindBy(name="accountname")
	    private WebElement OrganizationsNameTextField;
		
		@FindBy(name="button")
		private WebElement SaveButton;

		//getter methods
		public WebElement getOrganizationsNameTextField() 
		{
			return OrganizationsNameTextField;
		}

		public WebElement getSaveButton()
		{
			return SaveButton;
		}
		public void createOrganizationsPage(String Organizationsname)
		{
			OrganizationsNameTextField.sendKeys(Organizationsname);
			
			
		}
		
		public void saveorganization() {
			SaveButton.click();
		}
		

}
