package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignwithProductValidation {
 public CampaignwithProductValidation(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(css="span.dvHeaderText")
 private WebElement actualCampProductData;
 
 
public WebElement getActualCampProductData() {
	return actualCampProductData;
}
 public String actualCampProductName() {
	 return actualCampProductData.getText();
	 
 }
 
 
}
