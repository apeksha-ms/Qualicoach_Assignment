package Qualicoach1.Automation1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class verifyDownload {
	Initialization init=new Initialization();
	@Test
	public void DownloadTest()
	{
		WebDriver driver=init.DriverInit();
		Download d=new Download(driver);
		d.getDownload();
		
	}
}