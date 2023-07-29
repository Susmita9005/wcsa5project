package testNGAnnotation_Flag;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void method1() 
  {
	  Reporter.log("This method1 of Test Annotation",true);
  }
  @AfterMethod()
  public void method2()
  {
	  Reporter.log("After Method Annotation",true); 
  }
  @BeforeMethod
  public void method3()
  {
	  Reporter.log("After Method Annotation",true); 
  }
  @BeforeClass
  public void method4()
  {
	  Reporter.log("Before Class Annotation",true);
  }
  @AfterClass
  public void method5()
  {
	  Reporter.log("After Method Annotation",true); 
  }
  @BeforeSuite()
  public void method6()
  {
	  Reporter.log("After Method Annotation",true); 
  }
  @AfterSuite()
  public void method7()
  {
	  Reporter.log("After Method Annotation",true); 
  }
  @BeforeTest()
  public void method8()
  {
	  Reporter.log("After Method Annotation",true); 
  }
  @AfterTest
  public void method9()
  {
	  Reporter.log("After Method Annotation",true); 
  }
  @Test()
  public void method10()
  {
	  Reporter.log("After Method Annotation",true); 
  }
  
}
