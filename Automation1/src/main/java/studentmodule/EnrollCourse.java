package studentmodule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Qualicoach1.Automation1.Initialization;
import Qualicoach1.Automation1.LoginPage;

public class EnrollCourse extends Initialization {
public WebDriver driver;
public EnrollCourse(WebDriver driver) {
this.driver=driver;
}

 public void scrol() throws IOException {

	 login l=new login(driver);
		l.login1();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,600)");
Actions a = new Actions(driver);
WebElement move = driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='API Automation using REST Assured (Beginners)']"));
a.moveToElement(move).click().build().perform();
//if ((boolean) driver.findElement(By.xpath("//*[@value='Enrol me']")).isDisplayed()) {
driver.findElement(By.xpath("//input[@id='id_submitbutton']")).click();
//driver.findElement(By.id("next-activity-link")).click();
//driver.findElement(By.xpath("//*[@value='Attempt quiz now']")).click();
//driver.findElement(By.xpath("//*[@value='Start attempt']")).click();
driver.close();

}
}