package studentmodule;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Qualicoach1.Automation1.Initialization;


public class Studenttest extends Initialization
{
public WebDriver driver;

@BeforeTest
public void loginCheck() throws IOException 
{
	driverInit d=new driverInit();
WebDriver driver = d.driver();
	login l=new login(driver);
	l.login1();
	driver.close();
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
public void UpdateProfiletest() throws IOException  {
	driverInit d=new driverInit();
	WebDriver driver = d.driver();
	
UpdateProfile p = new UpdateProfile(driver);	
p.update();
driver.close();
}
@Test
public void Downloadtest() throws Exception  {
	driverInit d=new driverInit();
	WebDriver driver = d.driver();
DownloadCertificate c = new DownloadCertificate(driver);
c.download();
driver.close();
}
@Test
public void feedbackformtest() throws IOException {
	driverInit d=new driverInit();
	WebDriver driver = d.driver();
feedback f=new feedback(driver);
f.feedbackformtest();
driver.close();
}
@AfterTest
public void quiztest() throws IOException {
	driverInit d=new driverInit();
	WebDriver driver = d.driver();
	quiz q=new quiz(driver);
	q.quizattempt();
	driver.close();
}
}
