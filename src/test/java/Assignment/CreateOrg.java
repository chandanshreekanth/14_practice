package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

abstract class CreateOrg {

	public static void main(String[] args) throws Throwable 
	{
		
			int a=10;
			int b=20;
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("http://localhost:8888");
			driver.manage().window().maximize();
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.xpath("//a[text()= 'Organizations' and @href='index.php?module=Accounts&action=index']")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Shriya");
			driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
			
	}

}
