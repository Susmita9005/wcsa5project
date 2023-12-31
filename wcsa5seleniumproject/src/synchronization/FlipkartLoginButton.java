package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click(); //handle popup
		driver.findElement(By.xpath("//span[text()='Cart']")).click(); //click on cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click(); //click on login

	}

}
