package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	//initialization
public ProductPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//declaration

@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement PlusButtonforCreateProduct;


//getters method

public WebElement getPlusButtonforCreateProduct() {
	return PlusButtonforCreateProduct;
}
/**
 * 
 */
public void productplus() 
{
	PlusButtonforCreateProduct.click();
}

}
