package comcast.vtiger.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import comcast.vtiger.objectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  WebDriver driver;
	public static WebDriver sDriver;
	PropertyfileUtility plib=new PropertyfileUtility();
	
 @BeforeSuite()
  public void BS() 
  {
	  System.out.println("Data base Connection");
  }
  @BeforeTest(groups= {"smokeTest","regressionTest"})
  public void BT() 
  {
	  System.out.println("Execute Script in parallel mode");
	  
  }
  //@Parameters("BROWSER")
 @BeforeClass()
  public void BC() throws Throwable 
  {
	  String Browser = plib.GetPropertyKeyValue("browser");
	  if(Browser.equalsIgnoreCase("chrome"))
	  {
		  
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
	 
	  }
	  
	  else if(Browser.equalsIgnoreCase("firefox")) 
		  {
			   
			 WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		  }
		  
		  else if(Browser.equalsIgnoreCase("edge")) 
			  {
				  WebDriverManager.edgedriver().setup();
				   driver =new EdgeDriver();
			  }
		else
		  {
				  
				   driver=new ChromeDriver(); 
				  
		 }
			  
		sDriver	=driver;  
	 }	  
	 
     
  
  @BeforeMethod()
  public void BM() throws Throwable 
  {
	  System.out.println("Login the application");
	
		 String Url = plib.GetPropertyKeyValue("url");
		 String username = plib.GetPropertyKeyValue("un");
		 String password = plib.GetPropertyKeyValue("pw");
		 driver.get(Url);
	 //   driver.manage().window().maximize();
	//	wlib.waitForPageToLoad(driver);
		
	     LoginPage loginpage=new LoginPage(driver);
		 loginpage.login(username, password);
  }
  
  @AfterMethod()
  public void AM()
  {
	  System.out.println("Closing  the application"); 
  }
  
 @AfterClass()
  public void AC()
  {
	  System.out.println("Closing the browser"); 
  }
  
  @AfterTest()
  public void AT() 
  {
	  System.out.println("parallel execution is done"); 
  }
	
  @AfterMethod()
  public void AS()
  {
	  System.out.println("Data base connection close"); 
  }
}
