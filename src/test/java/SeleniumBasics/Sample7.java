package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample7 {
	@Test
	public static void navigate() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("Dhanu");
	
		Thread.sleep(3000);
		ele.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(5000);
		driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath("//h2[contains(.,'Facebook helps you')]"));
		System.out.println("Text in the element is:"+ ele1.getText());
		
		
		driver.close();

}
}