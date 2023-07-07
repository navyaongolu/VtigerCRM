package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage
{
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement createLink;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement organisationName;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement finalText;

	public WebElement getFinalText() {
		return finalText;
	}

	public WebElement getCreateLink() {
		return createLink;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getOrganisationName() {
		return organisationName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
}
