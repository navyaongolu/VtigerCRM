package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage
{
	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[contains(text(),'Organizations')])[1]")
	private WebElement organisationtab;
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createTab;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private  WebElement orgName;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	public WebElement getOrganisationtab() {
		return organisationtab;
	}

	public WebElement getCreateTab() {
		return createTab;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	
	
	

}
