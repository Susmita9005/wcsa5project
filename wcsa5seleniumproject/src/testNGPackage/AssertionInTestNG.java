package testNGPackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
  @Test
  public void verificationMethod() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://laptop-au9bmhc3/login.do");
	    //Non critical features
	    
	    String actualTitle = driver.getTitle();
//	    if(driver.getTitle().equalsIgnoreCase(actualTitle))
//	    {
//	    	driver.findElement(By.name("username")).sendKeys("admin");
//			driver.findElement(By.name("pwd")).sendKeys("manager");
//			driver.findElement(By.id("loginButton")).click();
//			System.out.println("title matched test case passed!!!");
//    }
//	    else
//	    {
//	    	System.out.println("title no matched test case failed");
//	    }
	    
	    SoftAssert sa = new SoftAssert();
	    AssertJUnit.assertEquals(driver.getTitle(), actualTitle);
	    
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    System.out.println("title matched test case passed!!");
	    
	    //Critical Features
	    
//	    if(driver.getTitle().equalsIgnoreCase("abcdfgh"))
//	    {
//	    	System.out.println("Home page title matched test case passed");
//	    	
//	    }
//	    else
//	    {
//	    	System.out.println("title not matched test case failed");
//	    	
//	    }
	    

		String actualTitleOfHomePage = driver.getTitle();
		AssertJUnit.assertEquals(driver.getTitle(),"Sushmita");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	    
	    
  }
}
