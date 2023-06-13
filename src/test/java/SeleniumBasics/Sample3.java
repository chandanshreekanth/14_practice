package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {
	
	@Test
	public static void linksCount()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count= links.size();
		System.out.println("Number of links:"+ count);
		List<WebElement> imgs = driver.findElements(By.xpath("//img"));
		int count2=imgs.size();
		System.out.println("Number of images:"+ count2);
		 
		List<WebElement> counts = driver.findElements(By.xpath("//a | //img | //table"));
		System.out.println("Counts of lit:"+ counts.size());
		
		driver.close();
		
		
	}

}
