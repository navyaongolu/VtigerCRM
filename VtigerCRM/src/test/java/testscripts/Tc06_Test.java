package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass22;


@Listeners(genericLibraries.ListenerImplementation.class)

public class Tc06_Test extends BaseClass22{
	@Test
	public void createWithExisting() throws InterruptedException {

		orgcontact.getContactsTab().click();

		orgcontact.getCreateContact().click();

		orgcontact.getFirstnameTF().sendKeys("raja");

		orgcontact.getLastnameTF().sendKeys("rani");

		orgcontact.getOrgLink().click();
		
		String parentId = driver.getWindowHandle();

		Thread.sleep(2000);
		
		utility.switchingtargetPage(driver.getWindowHandles(), parentId);
		
		orgcontact.getExistingorgName().click();
		
	

		utility.switchingBackToMain(parentId);

		

		orgcontact.getSaveButton().click();
		
		System.out.println("createWithExisting sucess");
	
	}

}
