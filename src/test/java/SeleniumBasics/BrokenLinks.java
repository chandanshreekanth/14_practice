package SeleniumBasics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

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
			verifyLinks(wb.getAttribute("href"));
		}

	}
	
	public static void verifyLinks(String linkUrl)
	{
		try 
		{
			URL url=new URL(linkUrl);
			HttpURLConnection httpConnection=(HttpURLConnection)url.openConnection();
			httpConnection.connect();
			
			if(httpConnection.getResponseCode()<300)
			{
				System.out.println("link is ok " +linkUrl);
			}
		} 
		catch (Exception e) 
		
		{
			System.out.println("broken" +linkUrl);
		}
	}

}
