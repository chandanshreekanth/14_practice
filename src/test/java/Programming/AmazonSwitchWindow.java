package Programming;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSwitchWindow 
{
	@Test
	public void amazonSwitchWindow() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=samsung+s22&crid=Q2D2AOSNF5D4&sprefix=samsung+s22%2Caps%2C283&ref=nb_sb_ss_ts-doa-p_1_11");
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		try 
		{
			driver.findElement(By.xpath("//span[text()='Samsung Galaxy S22 5G (Phantom White, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers']")).click();

		}
		catch (Exception e) 
		{
			driver.findElement(By.xpath("//span[text()=' 5G (Phantom White, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers']")).click();

			//driver.findElement(By.xpath(" 5G (Phantom White, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers")).click();
			System.out.println("catch block executed");
		}
		
		Set<String> allwh = driver.getWindowHandles();
		
		System.out.println(allwh);
		
		int count=allwh.size();
		System.out.println(count);
		allwh.remove(p_id);
		System.out.println(allwh.size());
		
		for (String child : allwh) 
		{
			driver.switchTo().window(child);
			//driver.findElement(By.xpath("//p[text()='without offer']")).click();
			String childTitle = driver.getTitle();
			System.out.println(childTitle);
	
		}
		
		driver.switchTo().window(p_id);
		
		String price = driver.findElement(By.xpath("//span[contains(.,'Phantom Black, 8GB, 128GB Storage) with No "
				+ "Cost EMI/Additional Exchange Offers') "+"and @class='a-size-medium a-color-base a-text-normal']"
				+ "/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']"
				+ "/descendant::span[@class='a-price-whole']")).getText();
		
		System.out.println(price);
		
	}
}
