package Qualicoach1.Automation1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class VerifyLogin{
	
	
	
 
	@Test(dataProvider="getData")
	public void firstTest(String user,String pass) {
		Initialization init=new Initialization();
		WebDriver driver=init.DriverInit();
		LoginPage l=new LoginPage(driver);
		l.GenericLogin(user,pass);
		
		driver.close();
	}
	
	@DataProvider
	public  Object[][] getData()
	{
		
		Object[][] data=new Object[2][2];
		//for valid credentials login
		data[0][0]="admin73";
		data[0][1]="Admin@6100";
		//for invalid credentials login
		data[1][0]="Admin7345";
		data[1][1]="Admin@6100";
		return data;

	}
	
}