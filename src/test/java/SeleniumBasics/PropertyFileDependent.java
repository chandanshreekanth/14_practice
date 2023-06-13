package SeleniumBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.OrganizationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFileDependent 
{
	public static void main(String[] args) throws IOException, Throwable 
	{
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\commonData.properties");
		
		Properties p=new Properties();
		p.load(fis);
		String BROWSER =	p.getProperty("browser");
		String URL =	p.getProperty("url");
		String USERNAME =	p.getProperty("username");
		String PASSWORD =	p.getProperty("password");
		
		
		
		Random ran=new Random();
		int number = ran.nextInt(10000);
		System.out.println(number);
		
		FileInputStream fis2 =new FileInputStream("./excel/book1.xlsx");
		Workbook book = WorkbookFactory.create(fis2);
		Sheet sheet = book.getSheet("organization");
		Row row = sheet.getRow(0);
			Cell cell = row.getCell(1);
		String value = cell.getStringCellValue()+number;
		System.out.println(value);
		
		WebDriver driver = null;
		if(BROWSER.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		if(BROWSER.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		
		LoginPage lp= new LoginPage(driver);
		lp.loginInputs(USERNAME, PASSWORD);
		
		HomePage hp=new HomePage(driver);
		hp.ClickOrganizationsLink();
		
		OrganizationPage op=new OrganizationPage(driver);
		op.organizationInput(value);
	
		Thread.sleep(4000);
		
		String text = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		System.out.println(text);
		String expected="TestYantra";
		if(text.contains(expected))
		{
			System.out.println("passed");
		}
		
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		//driver.close();
	}

}
