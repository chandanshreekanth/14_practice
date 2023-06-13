package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hardandsoft {

	@Test
	
public void abc()
{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//TakesScreenshot tss=(TakesScreenshot)driver;
		//File temp=tss.getScreenshotAs(OutputType.FILE);
//		File perm=new File("./screenshot/sample.jpg");
	//	FileUtils.copyFile(temp, perm);
		
		
	String actual =driver.getCurrentUrl();
	String expected="https://www.amazon.hfgin//";
	
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actual,expected );
	driver.quit();
	
	soft.assertAll();
	System.out.println("hii");
	
	
	}

}
