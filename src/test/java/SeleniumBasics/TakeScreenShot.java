package SeleniumBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build();
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("Window.scrollBy(0,500)");
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File hdd=new File("./screenshot/amazon3.png");
//		FileUtils.copyFile(temp, hdd);
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://amazon.in");
//		driver.manage().window().maximize();
//		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(f,new File("C:\\Users\\User\\Documents\\chandan\\screenshot\\amazon.png"));

	}

}
