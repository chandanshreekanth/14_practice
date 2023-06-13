package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganizationImg;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement accountName;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//img[@title="Create Organization..."]
	public WebElement getCreateOrganizationImg() {
		return createOrganizationImg;
	}

	public WebElement getAccountName() {
		return accountName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void organizationInput(String value)
	{
		createOrganizationImg.click();
		accountName.sendKeys(value);
		saveButton.click();
		
	}
	
	
}
