package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass22;


@Listeners(genericLibraries.ListenerImplementation.class)

public class Tc09_Test extends BaseClass22
{
	@Test
	public void deleteLead() throws InterruptedException
	{
		
		dellead.getLeadTab().click();
		
		dellead.getCheckBox().click();
		
		Thread.sleep(3000);
		
		dellead.getDeleteBtn().click();
		
		driver.switchTo().alert().accept();
		
		System.out.println("deleteLead sucess");
	}

}
