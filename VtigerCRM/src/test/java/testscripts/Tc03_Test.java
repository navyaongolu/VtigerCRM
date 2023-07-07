package testscripts;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass22;
import genericLibraries.ListenerImplementation;

@Listeners(genericLibraries.ListenerImplementation.class)
public class Tc03_Test extends BaseClass22
{
	@Test
	public void createContact() throws InterruptedException
	{
		
		home.getContactLink().click();
		try {
			ListenerImplementation.logger.log(Status.INFO,"clicking on contacts tab");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		contact.getCreateLink().click();
		
		ListenerImplementation.logger.log(Status.INFO,"clicking on create contact tab");
		
		contact.getLastname().sendKeys("raj");
		
		ListenerImplementation.logger.log(Status.INFO,"enter last name");
		
		contact.getOrganisationName().sendKeys("zoho");
		
		ListenerImplementation.logger.log(Status.INFO,"enter organisation name");
		
		contact.getSaveButton().click();
		
		ListenerImplementation.logger.log(Status.INFO,"save the contact by clicking save button");
		
	   // WebElement header = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
	    
		//assertEquals(contact.getFinalText(),header);
		
		
		System.out.println("create contact page success");
		
	}

}
