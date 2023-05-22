      package com.crm.sdet.product;
      import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericutility.BaseClass;
import comcast.vtiger.genericutility.Excel_Utility;
import comcast.vtiger.genericutility.Java_Utility;
import comcast.vtiger.genericutility.WebdriverUtility;
import comcast.vtiger.objectRepository.CreateProductPage;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.ProductPage;
import comcast.vtiger.objectRepository.ProductValidation;

      public class CeateproductTest extends BaseClass  {
    	  
   @Test(groups= {"regressionTest"})
	  public void createProduct() throws Throwable
   {
		
	 HomePage homepage=new HomePage(driver);
	  homepage.productModule();
		
	  ProductPage productpage=new ProductPage(driver);
	  productpage.productplus();
		
	Java_Utility jlib=new Java_Utility();
	  int RanNum = jlib.getRanDomNumber();
		
		Excel_Utility elib=new Excel_Utility();
     String productName = elib.getExcelData("product", 1, 0)+RanNum;
     
     CreateProductPage cppage=new CreateProductPage(driver);
     cppage.createProductPage(productName);
     
     System.out.println(productName);
     
     ProductValidation actualProductName=new ProductValidation(driver);
     String actualProductData = actualProductName.actualProductName();
     Assert.assertEquals(actualProductData.contains(productName), true);
    
  
     WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
     WebdriverUtility wlib=new WebdriverUtility();
     wlib.mousehove(driver, ele);
     homepage.signoutModule();
     driver.quit();
	
	 }
   
   //  @Test
	//public void createContact() {
	//	
	//	System.out.println("contact ctreated");
//
   //  }
}