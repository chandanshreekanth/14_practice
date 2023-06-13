package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	
	@Test
	public static void launchBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("7760642413");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("hello");
		Thread.sleep(3000);
		
	
		driver.findElement(By.xpath("//a[.='Create a Page']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
