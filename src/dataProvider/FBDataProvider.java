package dataProvider;

import org.testng.annotations.DataProvider;

public class FBDataProvider 
{
  @DataProvider(name="FBRegression")
  public static String[][] fbDataSet() 
  {
	  String data[][] = {{"Sneha","Lonkar","8765432312"},{"Nima","Kumar","8976678987"}};
	  return data;
  }
  
  @DataProvider(name="Sanity")
  public static String[][] fbDataSet2()
  {
	  String data[][]= {{"Rohit","Shetty","8888888888"},{"Sonam","Kapoor","5345678765"}};
	  return data;
  }
}
