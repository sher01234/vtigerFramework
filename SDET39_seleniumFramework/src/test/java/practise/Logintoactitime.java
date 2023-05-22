package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintoactitime {
public static void main(String[] args) throws Throwable {
	FileInputStream  fis= new FileInputStream("./data/commonproperty.properties");
	Properties p =new Properties();
	p.load(fis);
	String Url = p.getProperty("url1");
	String Username = p.getProperty("un1");
	String Password = p.getProperty("pw1");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Url);
	driver.findElement(By.name("username")).sendKeys(Username);
driver.findElement(By.name("pwd")).sendKeys(Password);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
