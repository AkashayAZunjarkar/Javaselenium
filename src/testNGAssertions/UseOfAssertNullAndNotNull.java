package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseOfAssertNullAndNotNull 
{
  @Test
  public void f() 
  {
	  //String a="Sneha";
	  String b=null;
	  
	  //1.Verify a is not null
	  //Assert.assertNotNull(a,"a is not null, TC is failed");
  
      //2.Verify b is null
	  Assert.assertNull(b,"b is not null, TC is failed");
  }
}
