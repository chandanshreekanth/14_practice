package SeleniumBasics;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.bigbasket.com/");
		
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		int count = list.size();
		System.out.println(count);
		
		for (WebElement wb : list) 
			
		{
			boolean linkActive = wb.isEnabled();
			if(wb.isEnabled()) {
			Assert.assertTrue(linkActive);}
			else {
				System.out.println(wb);
			}
			
		}
}
}