package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calandar 
{
	public static void main(String[] args)
	{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.goibibo.com/");
			
			driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
			
//			Actions actions=new Actions(driver);
//			actions.moveByOffset(10,10).click().perform();

	/*		driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']")).click();
			
			String datXpath = "//div[text()='March 2022']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='9']";
			driver.findElement(By.xpath(datXpath)).click();
			driver.findElement(By.xpath("//span[text()='Done']")).click();*/
			
			driver.findElement(By.xpath("//span[text()='From' and @class='sc-12foipm-17 fZDXDJ fswWidgetLabel']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bengaluru");
			driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']")).click();
			
			driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']")).click();
			//driver.findElement(By.xpath("//span[text()='To']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New Delhi");
			driver.findElement(By.xpath("//p[text()='Indira Gandhi International Airport']")).click();
			
			String datXpath = "//div[text()='March 2022']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='11']";
			driver.findElement(By.xpath(datXpath)).click();
			driver.findElement(By.xpath("//span[text()='Done']")).click();
			driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
			driver.findElement(By.xpath("//button[text()='VIEW FARES']")).click();
			driver.findElement(By.xpath("//input[@type='button']")).click();
			
			
			
	}
}
