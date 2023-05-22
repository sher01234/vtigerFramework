package practise;

import org.testng.annotations.Test;

public class RuntimeParameterfromeclipse {


@Test

public void getRunTimeData() {
	
	System.out.println(System.getProperty("browser"));
	System.out.println(System.getProperty("url"));
	System.out.println(System.getProperty("un"));
	System.out.println(System.getProperty("pw"));
}
}
