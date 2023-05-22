package comcast.vtiger.genericutility;

import java.util.Date;
import java.util.Random;

public class Java_Utility {
public static int getRanDomNumber() {
	Random ranDom=new Random();
	int ranDomNum = ranDom.nextInt(1000);
	return ranDomNum;
	
}

/*public String GetSystemDate() {
	Date date=new Date();
	String currentDate = date.toString();
	System.out.println(currentDate);
	String[] arr = currentDate.split(" ");


String YYYY=arr[5];
String dd=arr[2];
 int mm=date.getMonth()+1;
 String formate=YYYY+"-"+mm+"-"+dd;
return formate;
}*/

public String GetSystemDateinIST() {
	Date date=new Date();
	String currentDate = date.toString();
	System.out.println(currentDate);
	String[] arr = currentDate.split(" ");


String YYYY=arr[5];
String dd=arr[2];
 int mm=date.getMonth()+1;
 String formate=dd+"-"+mm+"-"+YYYY;
return formate;
}
}