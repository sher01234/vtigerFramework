package comcast.vtiger.genericutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility 
{
	/**
	 * wait for page to load before identifying and synchronized element in DOM
	 * @author sher
	 */
public void waitForPageToLoad(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}
/**
 * after every action it will wait for next action to perform
 * @author sher
 */
public void scriptTimeout(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
/**
 * used to wait for element to be clickable in GUI,and check for specific element for every 500milliseconds
 * @param driver
 * @param element
 *@author sher 
 */
public void waitforElementTobeClickable(WebDriver driver,WebElement element) {
	WebDriverWait w=new  WebDriverWait(driver, 20);
	w.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * used to wait for element to be clickable in GUI,and check for specific element for every 500milliseconds
 * @author sher 
 * 
 */
/*public void WaitforElementWithCustomTimeout(WebDriver driver,WebElement Element, int pollingTime)
{
FluentWait wait=new fluentWait(driver); 
wait.pollingEvery(Durationo.ofseconds(20));
wait.until(ExpectedConditions.elementToBeClickable(Element));
}*/
/**
 *  used to switch to any window based on window title
 *  
 *  @param driver
 *  @param PartialWindowTitle
 *  @author sher
 */
public void switchTowindow(WebDriver driver,String PartialWindowTitle) {
	Set<String> allid = driver.getWindowHandles();
	Iterator<String> it = allid.iterator();
	while(it.hasNext()) {
		String wid = it.next();
		driver.switchTo().window(wid);
		if(driver.getTitle().contains("products&actions")) 
		{
			break;
		}
	}
}
/**
 * used to sqwitch to alert window and accept(click on ok button)
 * @param driver
 * @author sher
 */

public void switchToAlertAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}
/**
 * used to sqwitch to alert window and dismiss(click on cancle button)
 * @param driver
 * @author sher
 */
public void switchToAlertAndCancle(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
/**
 * used to switched to frame window based on index
 * @param driver
 * @param index
 * @author sher
 */
public void switchtoFrame(WebDriver driver,int index) {
driver.switchTo().frame(index);

}
/**
 * used to switched to frame window based on id or name attribute
 * @param driver
 * @param id_name_attribute
 * @author sher
 */
public void switchtoFrame(WebDriver driver,String id_name_attribute) {
	driver.switchTo().frame(id_name_attribute);
}
/**
 * used to select the value from dropdown based on index
 * @param element
 * @param index
 * @author sher
 */
public void select(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
	
}
/**
 * used to select the value from dropdown based on text
 * @param element
 * @param text
 * @author sher
 */

public void select(WebElement element, String text) {
	Select s=new Select(element);
	s.selectByVisibleText(text);
	
	}
/**
 * used place mouse cursor on specified element
 * @param driver
 * @param element
 * @author sher
 */
public void mousehove(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
}
/**
 * used to right click on  specified element
 * @param driver
 * @param element
 * @author sher
 */
public void RightClickonElement(WebDriver driver,WebElement element) {
	

Actions a=new Actions(driver);
a.contextClick(element).perform();
}


}