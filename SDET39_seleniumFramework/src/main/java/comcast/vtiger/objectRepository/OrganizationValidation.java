package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationValidation 
{
public OrganizationValidation(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(css ="span.dvHeaderText")
private WebElement actualOrganizationData;

public WebElement getActualOrganizationData() {
	return actualOrganizationData;
}

public String actualOrganizationName() {
	return actualOrganizationData.getText();
}
}

