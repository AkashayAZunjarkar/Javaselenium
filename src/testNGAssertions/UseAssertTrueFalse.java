package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseAssertTrueFalse {
  @Test
  public void checkStatus() 
  {
	  //boolean a=true;
	  boolean b=false;
	  
	  //1.verify a is true
	  //Assert.assertTrue(a,"The value of a is false, TC is failed");
  
      //2. verify b is false
	  Assert.assertFalse(b,"The value of b is true, TC is failed");
  }
}
