package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass22;


@Listeners(genericLibraries.ListenerImplementation.class)

public class Tc10_Test extends BaseClass22
{
	@Test
	public void eventTest() throws InterruptedException
	{

		event.getQuickCreateDropdown().click();
		utility.handlingDropDown(event.getQuickCreateDropdown(),"Events");

		event.getSubjectTextfield().sendKeys("demo");

		//event.getDatestartTF().sendKeys("2023-07-28");
		utility.enteringDataIntoElement("2023-07-28",event.getDatestartTF());
		//event.getCalenderIconToEndDate().click();
		//event.getSatrtDate().click();
		Thread.sleep(4000);

		//event.getEndDateTF().sendKeys("2023-07-29");
		utility.enteringDataIntoElement("2023-07-29",event.getEndDateTF());
		//event.getCalenderIconToSatrtDate().click();
		//event.getEndDate().click();
		Thread.sleep(4000);

		event.getSavebutton().click();
		Thread.sleep(3000);
		/*
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(2000);
		home.getSighOut().click();
		*/
		
		System.out.println("eventTest sucess");
	}

}
