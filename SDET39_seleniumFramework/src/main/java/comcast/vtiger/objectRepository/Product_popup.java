package comcast.vtiger.objectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_popup {
	
	//initialization
public Product_popup(WebDriver driver) 
{
PageFactory.initElements(driver, this);	
	
}
//declaration
  @FindBy(id="search_txt")
  private WebElement ProductTextField;
  @FindBy(name="search")
  private WebElement SearchTextField;
  @FindBy(xpath = "//a[@href='javascript:window.close();']")
  private WebElement ClickOnProduct;
  //getters
public WebElement getProductTextField() {
	return ProductTextField;
}
public WebElement getSearchTextField() {
	return SearchTextField;
}
public WebElement getClickOnProduct() {
	return ClickOnProduct;
}
  public void addproduct(String addproduct)
  {
	  ProductTextField.sendKeys(addproduct);
	  SearchTextField.click();
	  ClickOnProduct.click();
	  
  }
 
  
}
