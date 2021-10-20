package studentmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Qualicoach1.Automation1.Initialization;

public class loginpage extends Initialization{
	
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 By submit=By.id("loginbtn");
	public void login() {
		driver.findElement(By.id("username")).sendKeys("scam143");
		driver.findElement(By.id("password")).sendKeys("scam143");
		driver.findElement(submit).click();
	}

}
