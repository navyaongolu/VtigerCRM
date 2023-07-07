package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass22;

@Listeners(genericLibraries.ListenerImplementation.class)
public class Tc02_Test extends BaseClass22 {
	@Test
	public void goToHomePage() {
		
		
		home.getContactLink().click();
		
		System.out.println("home page sucess");
		
	}

}
