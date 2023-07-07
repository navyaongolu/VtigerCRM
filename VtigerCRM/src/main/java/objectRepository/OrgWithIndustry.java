package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgWithIndustry 
{
	public OrgWithIndustry(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "(//a[contains(text(),'Organizations')])[1]")
	private WebElement organisationtab;
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createTab;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private  WebElement orgName;
	
	@FindBy(name= "industry")
	private WebElement industryDropdown;
	
	@FindBy(name= "accounttype")
	private WebElement typeTextField;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement GroupRadioButton;


	@FindBy(name = "assigned_group_id")
	private  WebElement assignedtoDropdon;

	@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement savebutton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement FinalConfirmationtext;


	public WebElement getOrganisationtab() {
		return organisationtab;
	}

	public WebElement getCreateTab() {
		return createTab;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getTypeTextField() {
		return typeTextField;
	}

	public WebElement getGroupRadioButton() {
		return GroupRadioButton;
	}

	public WebElement getAssignedtoDropdon() {
		return assignedtoDropdon;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getFinalConfirmationtext() {
		return FinalConfirmationtext;
	}

	

}
