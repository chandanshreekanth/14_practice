package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait 
{
	
	@Test
	
	public void explicitWait() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		//clickOn(driver, ele, 5);
		WebDriverWait wait=new WebDriverWait(driver, 4);
		//wait.until(ExpectedConditions.titleContains("Shopping"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//h1[.='Web Series']"));
		ele1.click();
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void clickOn(WebDriver driver,WebElement ele,int timeout)
	
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
	}
}
