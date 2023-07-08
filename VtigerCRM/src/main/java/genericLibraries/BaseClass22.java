package genericLibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactsPage;
import objectRepository.CreateContactWithExistingOrg;
import objectRepository.CreateEventpage;
import objectRepository.DeleteLead;
import objectRepository.LeadAndDuplicatePage;
import objectRepository.LeadPage;
import objectRepository.LeadWithDuplicate;
import objectRepository.LoginPage;
import objectRepository.OrgWithIndustry;
import objectRepository.OrganisationPage;
import objectRepository.homePage;

public class BaseClass22 
{
	public static WebDriver driver;
	public PropertiesUtility ppt = new PropertiesUtility();
	public WebDriverUtility utility;
	public LoginPage login;
	public homePage home;
	public ContactsPage contact;
	public OrganisationPage organise;
	public OrgWithIndustry orgind;
	public CreateContactWithExistingOrg orgcontact;
	public LeadPage lead;
	public LeadWithDuplicate leadDup;
	public DeleteLead dellead;
	public CreateEventpage event;
	public LeadAndDuplicatePage leadDel;

	@BeforeClass(alwaysRun = true)
	public void LaunchingBrowser() throws IOException{
		
			ppt = new PropertiesUtility();
			utility = new WebDriverUtility();

			if (ppt.readingdataFromPropertyFile("browser").equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();

			driver.get(ppt.readingdataFromPropertyFile("url"));

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println("getting details from properties file");
			
			driver.get(ppt.readingdataFromPropertyFile("url"));	
			home = new homePage(driver);
			login = new LoginPage(driver);
			contact = new ContactsPage(driver);
			organise = new OrganisationPage(driver);
			orgind =new OrgWithIndustry(driver);
			lead =new LeadPage(driver);
			leadDup = new LeadWithDuplicate(driver);
			orgcontact = new CreateContactWithExistingOrg(driver);
			dellead = new DeleteLead(driver);
			event = new CreateEventpage(driver);
			leadDel = new LeadAndDuplicatePage(driver);
			utility = new WebDriverUtility();
			
			login.getUsername().sendKeys(ppt.readingdataFromPropertyFile("username"));
			login.getPassword().sendKeys(ppt.readingdataFromPropertyFile("password"));
			login.getLoginButton().click();

			
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void navigateToApp() throws IOException {	
		home=new homePage(driver);
		
	}

	
	@AfterMethod(alwaysRun = true)
	public void checkTheTestResult(ITestResult result) {
		
		
		}
	
	
	@AfterClass(alwaysRun = true)
	public void teardownThheBrowser() throws InterruptedException {
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(3000);
		home.getSignOutLink().click();
		driver.quit();
	

}
}
