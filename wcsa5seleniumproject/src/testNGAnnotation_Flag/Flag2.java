package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "Login method!!",enabled =  true)
  public void method1() {
	  Reporter.log("Method1 from flag2",true);
  }
  @Test(description = "Login Method!!",enabled = false)
  public void method2() {
	  Reporter.log("Method2 from flag2",true);
  }
}


