package testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass22;
import genericLibraries.ListenerImplementation;

@Listeners(genericLibraries.ListenerImplementation.class)

public class Tc05_Test extends BaseClass22 {
	@Test
	public void orgwithInd() throws InterruptedException {
		

		orgind.getOrganisationtab().click();
		ListenerImplementation.logger.log(Status.INFO,"clicking on organisation tab");

		orgind.getCreateTab().click();
		ListenerImplementation.logger.log(Status.INFO,"clicking on create icon");

		orgind.getOrgName().sendKeys("qubaorg");
		ListenerImplementation.logger.log(Status.INFO,"enter org name");

		utility.selectReference(orgind.getIndustryDropdown()).selectByValue("Banking");
		ListenerImplementation.logger.log(Status.INFO,"select industry type");

		utility.selectReference(orgind.getTypeTextField()).selectByValue("Partner");
		ListenerImplementation.logger.log(Status.INFO,"select type ");

		orgind.getGroupRadioButton().click();
		ListenerImplementation.logger.log(Status.INFO,"selecting group radio button");
		
		Thread.sleep(3000);
		
		utility.selectReference(orgind.getAssignedtoDropdon()).selectByVisibleText("Marketing Group");
		ListenerImplementation.logger.log(Status.INFO,"select assigned to drop down");
		
		Thread.sleep(3000);
		
		orgind.getSavebutton().click();
		ListenerImplementation.logger.log(Status.INFO,"clicking on save button");
		
		if (orgind.getFinalConfirmationtext().getText().contains("qubaorg")) {
			System.out.println("testcase passed");
		} else {
			System.out.println("testcase failed");
		}
		System.out.println("orgwithind sucess");
		/*assertEquals(false, true);
		if(orgind.getFinalConfirmationtext().isDisplayed())

		{
			ListenerImplementation.logger.log(Status.PASS,"the text is displayed");
		}
		else
		{
			ListenerImplementation.logger.log(Status.INFO,"not displayed");
		}*/
	}

}
