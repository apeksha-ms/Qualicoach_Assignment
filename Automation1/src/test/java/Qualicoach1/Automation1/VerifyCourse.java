package Qualicoach1.Automation1;


import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class VerifyCourse {
	
	Initialization init=new Initialization();
	
	@Test
	public void VerifyUserTest() throws IOException {
		WebDriver driver=init.DriverInit();
		CreateCourse c=new CreateCourse(driver);
		c.getCreateCours();
	}

}
