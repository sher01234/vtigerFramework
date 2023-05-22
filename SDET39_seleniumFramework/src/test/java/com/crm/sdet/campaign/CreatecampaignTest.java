package com.crm.sdet.campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericutility.BaseClass;
import comcast.vtiger.genericutility.Excel_Utility;
import comcast.vtiger.genericutility.Java_Utility;
import comcast.vtiger.genericutility.WebdriverUtility;
import comcast.vtiger.objectRepository.CampaignValidation;
import comcast.vtiger.objectRepository.CampaignsPage;
import comcast.vtiger.objectRepository.CreateCampaignPage;
import comcast.vtiger.objectRepository.HomePage;

public class CreatecampaignTest  extends BaseClass{
	
@Test(groups= {"regressionTest"})
public  void  createOrganization() throws Throwable
         {
		  
	     HomePage homepage=new HomePage(driver);
		  homepage.moreButtonmodule();
		  homepage.campaignModule();
		  
		 CampaignsPage campaign=new CampaignsPage(driver);
		 campaign.Campaign();
		 
		 Java_Utility jlib =new Java_Utility();
		  int RanNum = jlib.getRanDomNumber();
		  
		  Excel_Utility elib=new Excel_Utility();
		 String campName = elib.getExcelData("campaign", 1, 0)+RanNum;
		  

           CreateCampaignPage createcampaignpage=new CreateCampaignPage(driver);
           createcampaignpage.createcampaignpage(campName);
           createcampaignpage.savecampaign();
           
           //intensionlay failing the script
     //  	 Assert.assertEquals(false, true);
       	  

           System.out.println(campName);
           
           
           CampaignValidation actualCampaignName=new CampaignValidation(driver);
           String actualCampaignData = actualCampaignName.actualCampaignName();
           Assert.assertEquals(actualCampaignData.contains(campName),true);
          // String actcamp = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
    //if(actcamp.contains(campName))
        // {
        //	   System.out.println("camp is succesfully created:  pass");
         //  }
        // else 
        // {
        	 // System.out.println("camp is not created:  fail");
	      //}

         WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        
         WebdriverUtility wlib=new WebdriverUtility();
         wlib.mousehove(driver, ele);
         homepage.signoutModule();
         driver.quit();      
	     
	    }

         }
