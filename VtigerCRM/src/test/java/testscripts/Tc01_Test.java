package testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass22;
import genericLibraries.ListenerImplementation;

@Listeners(genericLibraries.ListenerImplementation.class)
public class Tc01_Test extends BaseClass22
{
	@Test
	public void loginToApplication()
	{
		System.out.println("login Successfull");
		ListenerImplementation.logger.log(Status.INFO,"login sucess");
	}
	

}
