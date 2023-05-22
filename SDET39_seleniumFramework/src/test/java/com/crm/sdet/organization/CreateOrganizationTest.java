package com.crm.sdet.organization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import comcast.vtiger.genericutility.BaseClass;
import comcast.vtiger.genericutility.Excel_Utility;
import comcast.vtiger.genericutility.Java_Utility;
import comcast.vtiger.genericutility.WebdriverUtility;
import comcast.vtiger.objectRepository.OrganizationsPage;
import comcast.vtiger.objectRepository.CreateOrganizationsPage;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.OrganizationValidation;


//@Listeners(comcast.vtiger.genericutility.ListnerImplementationClass.class)
public class CreateOrganizationTest  extends BaseClass{
	
	//@Test
//	public void modifyContact()
	//
	//{
	//	System.out.println("Contact Modified");
	//	
  //  }
	
  @Test(groups= {"smokeTest","regressionTest"})
	//@Test(retryAnalyzer=comcast.vtiger.genericutility.ReTryImpClass.class)
public void createOrganization() throws Throwable 
{
	
	
	WebdriverUtility wlib=new WebdriverUtility();
    wlib.waitForPageToLoad(driver);
	
       HomePage homepage=new HomePage(driver);
	  homepage.organizationModule();
	  
	  OrganizationsPage orgnizationpage=new OrganizationsPage(driver);
	  orgnizationpage.organizations();
	  
	 
	  
	  Java_Utility jlib =new Java_Utility();
     int RanNum = jlib.getRanDomNumber();
     
     Excel_Utility elib=new Excel_Utility();
     String organizationName = elib.getExcelData("organization", 2, 0)+RanNum;
      
     CreateOrganizationsPage createorgpage=new CreateOrganizationsPage(driver);
     createorgpage.createOrganizationsPage(organizationName);
     createorgpage.saveorganization();
     
    // intensionlay failing the script
 	//  Assert.assertEquals(false, true);
         
     System.out.println(organizationName);
    
     OrganizationValidation actualOrganizationName= new OrganizationValidation(driver);
     String actualOrganizationData = actualOrganizationName.actualOrganizationName();
     Assert.assertEquals(actualOrganizationData.contains(organizationName), true);

     WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
     wlib.mousehove(driver, ele);
     
     //Actions a=new Actions(driver);
    // a.moveToElement(ele).perform();
     homepage.signoutModule();
     driver.quit();
    }


    }
