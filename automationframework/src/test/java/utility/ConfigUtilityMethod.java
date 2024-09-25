package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtilityMethod {
	
	public static String readData(String datatobeRead) throws Exception
	{
Properties props = new Properties();
		
		String path ="./config.properties";
		
		FileInputStream fs = new FileInputStream(path);
		
		props.load(fs);

		String value = props.getProperty(datatobeRead);
		
		System.out.println(value);
		
		return value;
	}

}
