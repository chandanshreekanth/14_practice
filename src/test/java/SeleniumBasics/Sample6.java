package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample6 {
	
	private static final Object True = null;

	@Test
	public static void Enabled() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.id("email"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		ele.sendKeys("yashu");
		Thread.sleep(6000);
		ele.clear();
		Thread.sleep(6000);
		driver.close();
		
		

}
}