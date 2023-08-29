package launch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepository.AmazonHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonHome 
{
	@Test
	
	public void amazonHomePage()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		String abc = "Computers & Accessories";
		AmazonHomePage page=new AmazonHomePage(driver);
		
		driver.switchTo().alert().accept();
		
		page.ClickallDropdown(abc);
	//	driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		Select select=new Select(ele);
		
		select.selectByVisibleText("Computers & Accessories");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dell");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
}
