package Qualicoach1.Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Download extends Gotoadmin{

 public Download(WebDriver driver) {
		// TODO Auto-generated constructor stub
	 this.driver=driver;
	}

public void getDownload(){
	
	 LoginPage l=new LoginPage(driver);
		l.GenericLogin("admin63","Admin@6101");
		getDashboard();
	 
	 	
		driver.findElement(By.linkText("Names of resources completed")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='centerpara'] /a /img[@alt='csv']")).click();
		
		
	}
}