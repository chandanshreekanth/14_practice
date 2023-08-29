package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube 
{
	@Test
	
	public void youTube() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/watch?v=FOChImfz9dw");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Play (k)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Pause keyboard shortcut k']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[@button]")).click();
		//driver.findElement(By.xpath("//button[@title='Play (k)']")).click();
		
		
	}
}
