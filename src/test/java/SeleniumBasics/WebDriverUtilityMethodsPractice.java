package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtilityMethodsPractice {
	
	WebDriver driver=null;

	public void chromedriver()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
	}
	
	public void maximizeWindow()
	{
		driver.manage().window().maximize();
		
	}
	
	public void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * This method will wait for 20 seconds for the visible element
	 * @param driver
	 * @author Chandan
	 * @param ele
	 * */
	public void explicitWait(WebDriver driver, WebElement ele)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	/**
	 * this method will select the data from the drop-down using index
	 * @author Chandan
	 * @param element
	 * @param index
	 */
	
	public void select(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * this method will select the data from the drop-down using text
	 * @author Chandan
	 * @param
	 * 
	 */
	
	public void select(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * this method will select the data from the drop-down using value
	 * @author Chandan
	 * @param
	 * 
	 */
	
	public void select(String value, WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * @author Chandan
	  * This method will perform the MouseHover action
	  * @param driver
	  */
		
	public void mousehover(WebElement element, WebDriver driver )
	{
		Actions act=new Actions(driver);
		act.moveToElement(null).perform();
		
	}
	
	/**
	 * This method will perform the Drag and Drop  action
	 * @param driver
	 * @param src
	 * @param target
	 */
	
	public void dragAndDrop(WebElement src, WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	
	/**
	 *This method will perform the Double click on element
	 * @param driver
	 * @param element
	 */
	
	public void dounleClick(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();;
	}
	
	/**
	 * This method will right click on element
	 * @param driver
	 */
	public void rightClick(WebDriver driver, WebElement element )
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This method will press enter key
	 * @param driver
	 */
	public void enterKey(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	/**
	 * This method will press enter key
	 * @param driver
	 * @throws AWTException 
	 */
	
	public void enterKey() throws AWTException
	{
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	/**
	 * This method will release enter key
	 * @param driver
	 * @throws AWTException 
	 */
	
	public void enterRelease() throws AWTException
	{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	/**
	 * This method will switch the frame based on index
	 * @param driver
	 * @param index
	 */
	
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method will switch the frame based on name or Id
	 * @param driver
	 * @param nameOrId
	 */
	
	public void switvhToFrame(WebDriver driver,String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	
	/**
	 * This method will switch the frame based on address of the element
	 * @param driver
	 * @param address
	 */
	
	public void switchToFrame(WebDriver driver,String address)
	{
		driver.switchTo().frame(address);
		
	}
	
	/**
	 * This method will switch the frame to parent frame
	 * @param driver
	 * @param 
	 */
	
	public void switchToFrameParent(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	/**
	 * This method will accept the alert
	 * @param driver
	 */
	
	public void aleartAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method will dismiss the alert
	 * @param driver
	 */
	public void aleartDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
		
	}
	
	/**
	 * This method will switch to window  depending on  partial Window Title
	 * @param driver
	 * @param partialWinTitle
	 */
	
	public void switchToWindows(WebDriver driver, String partialWinTitle)
	{
		//Step 1: use getWindowHandles to capture all window ids
		Set<String> windows = driver.getWindowHandles();
		
		//step 2: Iterate through the windows
		Iterator<String> it = windows.iterator();
		
		//step 3: Check whether there is next window
		while(it.hasNext())
		{
			//Step 4: capture current window id
			String winId = it.next();
			
			//Step 5: Switch to current window and capture title
			
			String currentTitle = driver.switchTo().window(winId).getTitle();
			
			//Step 6: check whether the current window is expected
			if(currentTitle.contains(partialWinTitle))
			{
				break;
			}
		}
	}
	
	/**
	 * this method will take screenshot and store it in folder called as Screenshot
	 * @param driver
	 * @param screenshotName
	 * @return 
	 * @return 
	 * @throws IOException 
	 * @throws Throwable
	 */
		
	public String takeScreenShot(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "./screenshot"+screenshotName+".jpg";
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		return dest.getAbsolutePath();
	}
	
	/**
	 * This method will perform random scroll
	 * @param driver
	 */
	
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"," ");
	}
	
	/**
	 * This method will scroll until the specified element is found
	 * @param driver
	 */
	
	public void scrollAction(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")",element);
		//js.executeScript("argument[0].scrollIntoView()",element);
	}
}
