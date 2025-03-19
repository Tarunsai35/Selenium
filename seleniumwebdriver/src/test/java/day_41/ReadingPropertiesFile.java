package day_41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdate\\config.properties");
		
		//loading properties files
		Properties pro = new Properties();
		pro.load(file);
		
		String url = pro.getProperty("appurl");
		String email = pro.getProperty("email");
		String pwd = pro.getProperty("password");
		String orid = pro.getProperty("orderid");
		String custid = pro.getProperty("customerid");
		
		System.out.println(url+ " "+email+" "+pwd+" "+orid+" "+custid);
		
		//reading all the keys from properties files
//		Set<String> keys = pro.stringPropertyNames();
//		System.out.println(keys);
		
		Set<Object> keys = pro.keySet();
		System.out.println(keys);
		
		//reading all the values from properties file
		
		Collection<Object> value = pro.values();
		System.out.println(value);
		
		file.close();
	}
}
