package Qualicoach1.Automation1;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class VerifyEnroll  {

	
	Initialization init=new Initialization();
	
	@Test
	public void AddUserTest() throws IOException
	{
		WebDriver driver=init.DriverInit();
		UserEnroll e=new UserEnroll(driver);
		e.getUserEnroll();
		driver.close();
	}
}
