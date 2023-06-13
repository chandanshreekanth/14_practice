package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class Iphone {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis =new FileInputStream("./excel/book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet2");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		String key = cell.getStringCellValue();
		System.out.println(key);
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(key);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//List<WebElement> iphone = driver.findElements(By.xpath("//div[@class='_25b18c']"));
		List<WebElement> iphone = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		int count = iphone.size();
		//System.out.println(count);
		
		ArrayList<Integer> array=new ArrayList<Integer>();
		
//		for (int i = 0; i < count; i++) 
//		{
//			System.out.println(iphone.get(i).getText());
//		}
//		System.out.println("printed");
		
		for (WebElement list : iphone) 
		{
			
			String a = list.getText();
			
				String b = a.substring(1);
			//	System.out.println(b);
				
				String c = b.replaceAll(",","");
			int d = Integer.parseInt(c);
			array.add(d);
			
		}
		Collections.sort(array);
		Collections.reverse(array);
		System.out.println(array);
	}

}
