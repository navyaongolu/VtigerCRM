package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactWithExistingOrg 
{
	public CreateContactWithExistingOrg(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsTab;
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContact;
	
	@FindBy(name = "firstname")
	private WebElement firstnameTF;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTF;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement orgLink;
	
	@FindBy(xpath = "//a[text()='vtigeruser']")
	private WebElement existingorgName;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	public WebElement getContactsTab() {
		return contactsTab;
	}

	public WebElement getCreateContact() {
		return createContact;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getExistingorgName() {
		return existingorgName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
