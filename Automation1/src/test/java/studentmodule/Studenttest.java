package studentmodule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualicoach1.Automation1.Initialization;


public class Studenttest extends Initialization
{
public WebDriver driver;

//@Test
public void loginCheck() throws IOException 
{
	driverInit d=new driverInit();
WebDriver driver = d.driver();
	login l=new login(driver);
	l.login1();
	
}
@Test
public void EnrollChecktest() throws IOException  {
driverInit d=new driverInit();
WebDriver driver = d.driver();
EnrollCourse b =new EnrollCourse(driver);
b.scrol();
driver.close();
}
@Test
public void UpdateProfiletest()  {
	
UpdateProfile p = new UpdateProfile(driver);	
p.update();
driver.close();
}
@Test
public void Downloadtest() throws Exception  {
DownloadCertificate c = new DownloadCertificate(driver);
c.download();
driver.quit();
}

}