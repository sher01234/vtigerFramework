package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class CreateProductPage {
//initialization
public CreateProductPage(WebDriver driver) 
{
PageFactory.initElements(driver, this);
	
}
//declaration
@FindBy(name="productname")
private WebElement ProductNameTextField;

@FindBy(name="button")
private WebElement SaveProductButton;

@FindBy(xpath="(//input[@title='Delete [Alt+D]'])[1]")
private WebElement DeleteProduct;
 
//getters method

public WebElement getProductNameTextField()
{
	return ProductNameTextField;
}



public WebElement getSaveProductButton() 
{
	return SaveProductButton;
}

 
public WebElement getDeleteProduct() 
{
	return DeleteProduct;
}
/**
 * 
 * @param productName
 * @author sher
 */


public void createProductPage(String productName)

   {
	ProductNameTextField.sendKeys(productName);
	SaveProductButton.click();
	
	}

/**
 * @author sher
 */
public void deleteProduct() 
{
	DeleteProduct.click();
}


}




