package SeleniumBasics;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample9 {
	
	@Test
	public static void Enabled() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.jqueryui.com/droppable/");
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement el2 = driver.findElement(By.xpath("//p[.='Drop here']"));
//		act.clickAndHold(ele1).moveToElement(el2).release().build().perform();
		act.dragAndDrop(ele1, el2);
		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		WebElement ele4 = driver.findElement(By.xpath("//a[.='API Documentation']"));
		
		act.moveToElement(ele4);
		Thread.sleep(8000);
		driver.close();

}
}