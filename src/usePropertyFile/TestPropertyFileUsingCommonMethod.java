package usePropertyFile;

import java.io.IOException;

import commonlyUsedmethods.CommonMethods;

public class TestPropertyFileUsingCommonMethod {

	public static void main(String[] args) throws IOException 
	{
		String value1 = CommonMethods.readDataFromPropertyFile("pinCode");
		System.out.println(value1);
		
		String value2 = CommonMethods.readDataFromPropertyFile("age");
		System.out.println(value2);
		
		System.out.println(CommonMethods.readDataFromPropertyFile("MobNum"));

	}

}
