package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseAssertEquals 
{
  @Test
  public void f() 
  {
	  String a = "Sneha";
	  String b = "Sneha";
	  //String c = "Velocity";
	  
	  //Verify a and b are equal
	  Assert.assertEquals(a, b, "A and B are not equal, TC is failed");
  
      //Verify b and c are not equal
	  //Assert.assertEquals(b, c,"B and C are not eqaul, TC is failed");
  }
}
