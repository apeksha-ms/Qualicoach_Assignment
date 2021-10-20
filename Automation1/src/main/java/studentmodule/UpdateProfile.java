package studentmodule;

//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Qualicoach1.Automation1.Initialization;
import Qualicoach1.Automation1.LoginPage;

public class UpdateProfile extends Initialization {
public WebDriver driver;
public UpdateProfile(WebDriver driver) {
this.driver=driver;
}

public void update() {
	LoginPage l=new LoginPage(driver);
	l.GenericLogin1("user88","User@9146");

driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@class='userbutton']")).click();
driver.findElement(By.xpath("//*[@data-title='profile,moodle']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Edit profile')]")).click();
driver.findElement(By.xpath("//*[@id='id_firstname']")).clear();
driver.findElement(By.xpath("//*[@id='id_firstname']")).sendKeys("Test141");
driver.findElement(By.xpath("//*[@value='Update profile']")).click();
}
}