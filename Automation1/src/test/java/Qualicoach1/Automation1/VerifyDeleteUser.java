package Qualicoach1.Automation1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class VerifyDeleteUser {
	Initialization init=new Initialization();
	@Test
	public void VerifyDeleteTest() {
		WebDriver driver=init.DriverInit();
		DeleteUser d=new DeleteUser(driver);
		d.getDelete();
		driver.close();
	}
}
