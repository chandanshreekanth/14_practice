package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 

{
	@FindBy(linkText = "Organizations")
	private WebElement organizationsLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOrganizationsLink() 
	{
		return organizationsLink;
	}
	
	public void ClickOrganizationsLink()
	{
		organizationsLink.click();
	}
	
}
