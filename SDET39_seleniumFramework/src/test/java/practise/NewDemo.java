package practise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewDemo 
{
	@Test(retryAnalyzer=comcast.vtiger.genericutility.ReTryImpClass.class)
public void modifiedContact() 
{
	   //intensionlay failing the script
  	// Assert.assertEquals(false, true);
  	  
	System.out.println("modified contact");

}
}
