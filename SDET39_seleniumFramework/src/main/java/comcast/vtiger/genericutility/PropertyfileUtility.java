package comcast.vtiger.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyfileUtility {
	public String GetPropertyKeyValue(String key) throws Throwable {
		FileInputStream  fis= new FileInputStream("./data/commonproperty.properties");
		Properties p =new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
		
		
	}
}
