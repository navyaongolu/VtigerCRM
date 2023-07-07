package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage
{
	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leadTab;
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createLead;
	
	@FindBy(name= "firstname")
	private WebElement firstnameTF;
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	@FindBy(name="company")
	private WebElement companyName;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement assignedTo;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

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

	public WebElement getAssignedTo() {
		return assignedTo;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
