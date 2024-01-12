package usePropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream myFile = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\javaSelenium\\CoverFoxData.properties");
		prop.load(myFile);
		String value = prop.getProperty("Name");
		System.out.println(value);
	}

}
