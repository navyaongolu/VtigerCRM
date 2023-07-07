package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadAndDuplicatePage 
{
	public LeadAndDuplicatePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Leads")
	private WebElement leadTab;
	
	@FindBy(xpath = "//img[@alt='Create Lead...']")
	private WebElement createLead;
	
	@FindBy(name= "firstname")
	private WebElement firstnameTF;
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	@FindBy(name="company")
	private WebElement companyName;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "(//input[@title='Duplicate [Alt+U]'])[1]")
	private WebElement duplicateButton;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement dupSaveButton;
	
	@FindBy(xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement leadDeleteButton;

	public WebElement getLeadTab() {
		return leadTab;
	}

	public WebElement getCreateLead() {
		return createLead;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getDuplicateButton() {
		return duplicateButton;
	}

	public WebElement getDupSaveButton() {
		return dupSaveButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getLeadDeleteButton() {
		return leadDeleteButton;
	}
	
	
}
