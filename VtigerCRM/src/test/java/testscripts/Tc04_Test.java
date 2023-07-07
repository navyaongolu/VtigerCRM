package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass22;
import genericLibraries.ListenerImplementation;


@Listeners(genericLibraries.ListenerImplementation.class)

public class Tc04_Test extends BaseClass22
{
	@Test
	public void organisationTest() throws InterruptedException
	{
		
		
		organise.getOrganisationtab().click();
		ListenerImplementation.logger.log(Status.INFO,"clicking on organisation tab");
		
		organise.getCreateTab().click();
		ListenerImplementation.logger.log(Status.INFO,"clicking on create tab icon");
		
		organise.getOrgName().sendKeys("tcs123");
		ListenerImplementation.logger.log(Status.INFO,"enter org name");
		
		organise.getSaveButton().click();
		ListenerImplementation.logger.log(Status.INFO,"clicking on save button");
		
		Thread.sleep(5000);
		
		System.out.println("organisation creation sucess");
		
	}

}
