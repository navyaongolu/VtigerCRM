package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadWithDuplicate 
{

	
	public LeadWithDuplicate(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leadTab;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusbutton;
	
	@FindBy(name = "lastname")
	private WebElement lastNameInleadPage;
	
	@FindBy(name = "company")
	private WebElement LeadPagecompanyname;
	
	@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement LeadpageSavebtn;
		
	@FindBy(xpath = "(//input[@title='Duplicate [Alt+U]'])[1]")
	private WebElement duplicatebtn;
	
	@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement dupSavebtn;
		
	
	public WebElement getLeadTab() {
		return leadTab;
	}

	public WebElement getPlusbutton() {
		return plusbutton;
	}

	public WebElement getLastNameInleadPage() {
		return lastNameInleadPage;
	}

	public WebElement getLeadPagecompanyname() {
		return LeadPagecompanyname;
	}

	public WebElement getLeadpageSavebtn() {
		return LeadpageSavebtn;
	}
	public WebElement getDuplicatebtn() {
		return duplicatebtn;
	}

	public WebElement getDupSavebtn() {
	
		return dupSavebtn;
	}

	
	


}
