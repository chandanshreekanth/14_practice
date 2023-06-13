package SeleniumBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Generic_Class;


public class DependantOfGenericClass extends Generic_Class
{
	@Test
	
	public void dependantOfGenericClass()
	{
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Assert.assertEquals(expectedTitle,actualTitle );
		
		System.out.println("passed");
		
	}
}
