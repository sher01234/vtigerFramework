package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintovtiger {
	public static void main(String[] args) throws Throwable  {
		FileInputStream  fis= new FileInputStream("./data/commonproperty.properties");
		Properties p =new Properties();
		p.load(fis);
		String Url = p.getProperty("url");
		String Username = p.getProperty("un");
		String Password = p.getProperty("pw");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.findElement(By.name("user_name")).sendKeys(Username);
driver.findElement(By.name("user_password")).sendKeys(Password);
driver.findElement(By.id("submitButton")).click();
}
}