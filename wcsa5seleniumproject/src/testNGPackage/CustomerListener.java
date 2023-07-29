package testNGPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomerListener extends BaseTest implements ITestListener {
  @Override
  public void onTestStart(ITestResult result)
  {
	  Reporter.log("Test Started",true);
  }
  @Override
  public void onTestSuccess(ITestResult result)
  {
	  Reporter.log("Test Executed Successfully!!",true);
  }
  @Override
  public void onTestFailure(ITestResult result)
  {
	  String methodName = result.getMethod().getMethodName();
	  Reporter.log("This method is failed taken the screenshot :"+methodName,true);
	  failedMethod(methodName);
  }
  @Override
  public void onTestSkipped(ITestResult result)
  {
	  Reporter.log("Test Skipped",true);
  }
  
}
