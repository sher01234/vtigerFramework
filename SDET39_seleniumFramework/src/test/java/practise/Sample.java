package practise;

import org.testng.annotations.Test;

public class Sample 
{
	@Test(priority = -1)
     public void createcontact() 
    {
	     System.out.println("contact is created");
	     
    }
	@Test(priority=0)
     
     public void modifiedcontact()
     {
     
    	 System.out.println("contact is modified");
     }
     
	@Test(priority=-5)
     public void deletecontact()
     {
    	 
    	 System.out.println("contact has been deleted");
     }
	@Test(priority=3)
	
	public void searchcontact()
	{
		System.out.println("search contact");
	}

}
