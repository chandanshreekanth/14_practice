package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage 
{
	@FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
	private WebElement allDropdown;

	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getallDropdown() 
	{
		return allDropdown;
	}
	
//	public void ClickallDropdown()
//	{
//		allDropdown.click();
//	}
	public void ClickallDropdown(String abc)
	{
	Select select=new Select(allDropdown);
	
	select.selectByVisibleText(abc);
	
	}
}
