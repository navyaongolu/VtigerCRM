package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass22;


@Listeners(genericLibraries.ListenerImplementation.class)

public class Tc08_Test extends BaseClass22 {
	@Test
	public void leadWithDup() {
		
		
		leadDup.getLeadTab().click();
		
		leadDup.getPlusbutton().click();
		
		leadDup.getLastNameInleadPage().sendKeys("etfgag");
		
		leadDup.getLeadPagecompanyname().sendKeys("ehgdu");
		
		leadDup.getLeadpageSavebtn().click();
				
		leadDup.getDuplicatebtn().click();
		
		leadDup.getDupSavebtn().click();
		
		System.out.println("leadWithDup sucess");
	}

}
