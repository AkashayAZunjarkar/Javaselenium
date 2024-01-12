
package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseOfHardAssert 
{
  @Test
  public void f() 
  {
	  String a="Sneha";
	  String b="hi";
	  
	  Assert.assertEquals(a, b,"a and b are not equal, TC is failed");
	  
	  Assert.assertNotNull(b,"b is null, TC is failed");
  }
  
  @Test
  public void c()
  {
	  String a=null;
	  Assert.assertNull(a,"a is not null, TC is failed");
  }
}
