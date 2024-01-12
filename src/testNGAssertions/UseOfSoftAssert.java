package testNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UseOfSoftAssert 
{
  @Test
  public void f() 
  {
	  SoftAssert s = new SoftAssert();
	  String a="Sneha";
	  String b="Hi";
	  s.assertEquals(a, b,"a and b are not equal,TC is failed");
	  s.assertNull(b,"b is not null,TC is failed");
	  s.assertAll();
  }
  
  @Test
  public void i()
  {
	  String a=null;
	  SoftAssert o = new SoftAssert();
	  o.assertNull(a,"a is not null,TC is failed");
	  o.assertAll();
  }
}
