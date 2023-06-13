package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	
	@Test
	public static void launchBrowser() throws InterruptedException
	{
		
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.id("email")).sendKeys("yashgowdamk2707@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("yashgdwjcjdcgui");
	 Thread.sleep(3000);
	 driver.findElement(By.name("login")).click();
	 Thread.sleep(7000);
	 driver.close();
	 
	 
	 
	}

}
