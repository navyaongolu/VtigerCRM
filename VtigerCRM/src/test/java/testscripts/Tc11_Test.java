package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass22;


@Listeners(genericLibraries.ListenerImplementation.class)

public class Tc11_Test extends BaseClass22{
	@Test
	public void leadDelete() throws InterruptedException
	{
		String firstname="madhura";
		
		leadDel.getLeadTab().click();
		
		leadDel.getCreateLead().click();
		
		leadDel.getFirstnameTF().sendKeys(firstname);
		
		leadDel.getLastnameTF().sendKeys("vani");
		
		leadDel.getCompanyName().sendKeys("jsp");
		
		leadDel.getSaveButton().click();
		
		leadDel.getDuplicateButton().click();
		
		leadDel.getDupSaveButton().click();
		
		leadDel.getDeleteButton().click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
	  
		 WebElement leadname = driver.findElement(By.xpath("//a[contains(text(),'"+firstname+"')]/../..//input[@name='selected_id']"));
	  
		leadname.click();
	 
	  //Thread.sleep(5000);
	  
	  leadDel.getLeadDeleteButton().click();
	  
	  driver.switchTo().alert().accept();
		
	  
	   System.out.println("leadDelete succes");
	  // utility.scrollingAction(500, 500);
	   
	  // Thread.sleep(5000);
	   
	  // leadname.click();
	   
	  
	   
	 //  leadDel.getLeadDeleteButton().click();
		
		

	}
}
