package com.crm.sdet.product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import comcast.vtiger.genericutility.BaseClass;
import comcast.vtiger.genericutility.Excel_Utility;
import comcast.vtiger.genericutility.Java_Utility;
import comcast.vtiger.genericutility.WebdriverUtility;
import comcast.vtiger.objectRepository.CreateProductPage;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.ProductPage;

public class CreateProductDeletepProductTest extends BaseClass

    {
	@Test(groups= {"smokeTest"})
public  void createProductDeletepProduct() throws Throwable {
		
	 HomePage homepage=new HomePage(driver);
	 homepage.productModule();
		
	 ProductPage productpage=new ProductPage(driver);
	 productpage.productplus();
		
	 Java_Utility jlib =new Java_Utility();
	 int RanNum = jlib.getRanDomNumber();
		
	 Excel_Utility elib=new Excel_Utility();	
     String productName = elib.getExcelData("product", 1, 0)+RanNum;
    
     CreateProductPage cppage=new CreateProductPage(driver);
     cppage.createProductPage(productName);
    
     System.out.println(productName);
     cppage.deleteProduct();
     
     WebdriverUtility wlib=new WebdriverUtility();
     wlib.switchToAlertAndAccept(driver);
    
     WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
     wlib.mousehove(driver, ele);
     homepage.signoutModule();
     driver.quit();

}
	
	}
