package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket {

	@Test
	
	public void bigbasket() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bigbasket.com/");
		WebElement dropDownEle = driver.findElement(By.xpath("//a[@data-toggle='dropdown' and @ng-mouseover='vm.readyToShow = true']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(dropDownEle).perform();
		WebElement foodGrains = driver.findElement(By.xpath("//ul[@id='navBarMegaNav']/descendant::li[@data-submenu-id='foodgrains-oil-masala']"));
		act.moveToElement(foodGrains).perform();
		
		WebElement atta = driver.findElement(By.xpath("(//a[text()='Atta, Flours & Sooji'])[2]"));
		act.moveToElement(atta).perform();
		
	
		//String list = driver.findElement(By.xpath("((//ul[@class='list-unstyled'])[3]/li/a)[2]")).getText();
		  List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]/li/a"));
		
		//System.out.println(list);
		  
		  int l = list.size();
		  
			for (int i = 0; i <l; i++) 
			{
				String a = list.get(i).getText();
				System.out.println(a);
			}
		
		driver.close();
		
	}
	
}
