package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleToGoogleMap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		 Thread.sleep(2000);
		 
		 WebElement we = driver.findElement(By.xpath("//iframe[@name='app']"));
		 driver.switchTo().frame(we);
		 WebElement target = driver.findElement(By.xpath("//a[@href='https://maps.google.com/']"));
		 target.click();
		 
		 
		   

	}

}
