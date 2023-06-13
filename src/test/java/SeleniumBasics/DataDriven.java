package SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> lists = driver.findElements(By.xpath("//a"));
		int count = lists.size();
		System.out.println(count);
		
		FileInputStream fis=new FileInputStream("./excel/book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		for (int i = 0; i < count; i++) 
		{
			Row r = sheet.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(lists.get(i).getAttribute("href"));
			System.out.println(lists.get(i).getAttribute("href"));
		}
		
		FileOutputStream fout=new FileOutputStream("./excel/book1.xlsx");
		book.write(fout);
		
	}

}
