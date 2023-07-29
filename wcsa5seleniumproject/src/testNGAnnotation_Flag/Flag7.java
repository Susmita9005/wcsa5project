package testNGAnnotation_Flag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7 {
  @Test()
  public void loginMethod()
  {
	  System.out.println("Its is used to perform login!!");
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod()
  {
	  Assert.fail();
	  System.out.println("it is use to create user!!");
  }
  @Test(dependsOnMethods = "createUserMethod",alwaysRun = true)
  public void logoutMethod()
  {
	  Assert.fail();
	  System.out.println("it is use to perform logout!!");
  }
}
