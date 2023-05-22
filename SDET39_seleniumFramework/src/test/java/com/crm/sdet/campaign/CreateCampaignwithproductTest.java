package com.crm.sdet.campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericutility.BaseClass;
import comcast.vtiger.genericutility.Excel_Utility;
import comcast.vtiger.genericutility.Java_Utility;
import comcast.vtiger.genericutility.WebdriverUtility;
import comcast.vtiger.objectRepository.CampaignsPage;
import comcast.vtiger.objectRepository.CampaignwithProductValidation;
import comcast.vtiger.objectRepository.CreateCampaignPage;
import comcast.vtiger.objectRepository.CreateProductPage;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.ProductPage;
import comcast.vtiger.objectRepository.Product_popup;

public class CreateCampaignwithproductTest extends BaseClass {
	@Test(groups= {"smokeTest"})
public void createCampaignwithProduct() throws Throwable
    {
		
		WebdriverUtility wlib=new WebdriverUtility();
	    wlib.waitForPageToLoad(driver);
	
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
    
    homepage.moreButtonmodule();
    homepage.campaignModule();
  
    CampaignsPage campaignpage=new CampaignsPage(driver);
    campaignpage.Campaign();

    int RanNum1 = jlib.getRanDomNumber();

	  
	String campaignName = elib.getExcelData("campaign", 1, 0)+RanNum1;
    System.out.println(campaignName);
    CreateCampaignPage createcamppage=new CreateCampaignPage(driver);
    createcamppage.createcampaignpage(campaignName);
    createcamppage.productplusincampaign();

    Thread.sleep(2000);
   
    wlib.switchTowindow(driver, "Products&action");


    Product_popup ppopup=new Product_popup(driver);
    ppopup.addproduct(productName);


    wlib.switchTowindow(driver, "Campaigns&action");

    createcamppage.savecampaign();
    
    CampaignwithProductValidation actualCampwithProduct=new CampaignwithProductValidation(driver);
   String actualCampwithProductData = actualCampwithProduct.actualCampProductName();
   Assert.assertEquals(actualCampwithProductData.contains(campaignName), true);
    
   // String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
   // if(actData.contains(campaignName)) 
//    {
 //   System.out.println("pass");
//    }
 //   else 
//    {
 //   System.out.println("fail");
  //   
 //   }

    WebElement ele1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
    wlib.mousehove(driver, ele1);

    homepage.signoutModule();
    driver.close();
 }

 }
    
