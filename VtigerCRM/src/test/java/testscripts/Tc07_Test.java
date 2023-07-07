package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass22;


@Listeners(genericLibraries.ListenerImplementation.class)

public class Tc07_Test extends BaseClass22
{
	
	@Test
	public void createLead() throws InterruptedException
	{
		
		lead.getLeadTab().click();
		
		lead.getCreateLead().click();
		
		lead.getFirstnameTF().sendKeys("saraa");
		
		lead.getLastnameTF().sendKeys("singh");
		
		lead.getCompanyName().sendKeys("pqr");
		
		lead.getAssignedTo().click();
		
		lead.getSaveButton().click();
		
		System.out.println("createLead succes");
		
		
	}
}
