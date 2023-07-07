package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteLead 
{
	
	public DeleteLead(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leadTab;
	
	@FindBy(name = "selected_id")
	private WebElement checkBox;
	
	@FindBy(xpath = "(//input[@class='crmbutton small delete'])[1]")
	private WebElement deleteBtn;

	public WebElement getLeadTab() {
		return leadTab;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

}
