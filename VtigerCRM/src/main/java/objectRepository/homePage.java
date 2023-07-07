package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage
{
	 public homePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Contacts']")
	 private WebElement contactLink;
	
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;
		
	public WebElement getAdministrator() {
		return administrator;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}
	 

}
