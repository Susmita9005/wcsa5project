package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	//It is used to describe the method or test case
  @Test(description = "Login Method!!")
  public void method1() {
	  Reporter.log("method from flag1");
  }
  @Test(description = "Login Method!!")
  public void method2() {
	  Reporter.log("method from flag1");
  }
}
