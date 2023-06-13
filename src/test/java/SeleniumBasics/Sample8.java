package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample8 {
	@Test
	public static void Enabled() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(.,'Create new account')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Dhanu");
		driver.findElement(By.name("lastname")).sendKeys("Gowda");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7760642413");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("123456789");
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel= new Select(ele);
		sel.selectByVisibleText("27");
		Thread.sleep(6000);
		WebElement ele1 = driver.findElement(By.name("birthday_month"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("Jul");
		Thread.sleep(6000);
		WebElement ele3 = driver.findElement(By.name("birthday_year"));
		Select sel2=new Select(ele3);
		sel2.selectByVisibleText("1999");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[.='Male']")).click();
		Thread.sleep(2000);
      driver.close();
}
}