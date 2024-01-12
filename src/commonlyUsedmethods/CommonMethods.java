package commonlyUsedmethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CommonMethods 
{
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile = new FileInputStream("C:\\Users\\Admin\\Desktop.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("CoverFox");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream myFile = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\javaSelenium\\CoverFoxData.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}
}
