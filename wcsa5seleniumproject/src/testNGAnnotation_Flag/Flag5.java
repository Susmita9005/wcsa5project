package testNGAnnotation_Flag;

import org.testng.annotations.Test;

public class Flag5 {
  @Test()
  public void loginMethod()
  {
	  System.out.println("It is used to perform login!!");
  }
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod()
  {
	  System.out.println("It is used to create user!!");  
  }
  @Test(dependsOnMethods = "createUserMethod" )
  public void logoutMethod()
  {
	  System.out.println("It is used to perform logout!!"); 
  }
}
