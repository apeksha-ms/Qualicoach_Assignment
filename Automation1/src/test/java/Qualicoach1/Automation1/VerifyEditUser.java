package Qualicoach1.Automation1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class VerifyEditUser {

	Initialization init=new Initialization();
	
	@Test
	public void EditUserTest() {
		
		WebDriver driver=init.DriverInit();
		EditUser E=new EditUser(driver);
		E.getEditUser();
		driver.close();
	}
}