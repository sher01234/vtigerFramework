package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//intialization
public class LoginPage {
public LoginPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

//declaration 
@FindBy(name="user_name")
 private WebElement UserNameTextField;

@FindBy(name="user_password")
private WebElement UserPassswordTextField;

@FindBy(id="submitButton")
private WebElement SubmitButton;

//getters method
public WebElement getUserNameTextField() {
	return UserNameTextField;
}

public WebElement getUserPassswordTextField() {
	return UserPassswordTextField;
}

public WebElement getSubmitButton() {
	return SubmitButton;
}

//buisness logic
/**
 * 
 * @param username
 * @param password
 * @author sher
 */

public void login(String username,String password) {
	UserNameTextField.sendKeys(username);
	UserPassswordTextField.sendKeys(password);
	SubmitButton.click();
}





}
