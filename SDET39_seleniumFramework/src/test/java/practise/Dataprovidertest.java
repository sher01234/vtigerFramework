package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest
{  
	@Test(dataProvider="dataprovider_test")
	
	public void bookTicket(String src,String dest)
	{
		
		System.out.println("book tickets from "+src+" to  "+dest+"");
	}
	
	@DataProvider
	public Object[][] dataprovider_test()
	{
      Object[][]  objArr=new Object[5][2];
      
      objArr[0][0]="banglore";
      objArr[0][1]="mysore";
      
      objArr[1][0]="banglore";
      objArr[1][1]="goa";
      
      objArr[2][0]="banglore";
      objArr[2][1]="maglore";
      
      objArr[3][0]="banglore";
      objArr[3][1]="delhi";
      
      objArr[4][0]="banglore";
      objArr[4][1]="chennai";
	return objArr;
	}
      
}
