package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoneycontrolAutomate 
{
	@Test
	
	public void moneycontrolAutomate() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
//		WebElement element = driver.findElement(By.xpath("//h2[text()='Featuring iconic brands']"));
//		int x = element.getLocation().getX();
//		int y=element.getLocation().getY();
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("argument[0].scrollIntoView()",element);
		//js.executeScript("window.scrollBy("+x+","+y+")");
		
		
		//String text = driver.findElement(By.xpath("//*[@id='highcharts-0']//*[local-name()='svg']//*[name()='g' and @class='highcharts-tooltip']//*[name()='text']//*[name()='tspan' and text()='Friday, Aug 4, 10:21']")).getText();
		
		//System.out.println(text);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Indices Chart']"));
		
		driver.switchTo().frame(frame);
		
		WebElement ele = driver.findElement(By.xpath("(//div[@id='container1d']/..//*[name()='svg']//*[name()='g' and @class='highcharts-grid'])[2]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		
		//act.moveByOffset(100, 50).perform();
		System.out.println(driver.findElement(By.xpath("//*[@id='highcharts-0']//*[local-name()='svg']//*[name()='g' and @class='highcharts-tooltip' and @visibility='visible']//*[name()='text']")).getText());
		
		
	}
}
