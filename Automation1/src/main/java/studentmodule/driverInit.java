package studentmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverInit
{
public WebDriver driver()
{
	System.setProperty("webdriver.chrome.driver", "//Users//aumapathi//Downloads//chromedriver");
WebDriver driver=new ChromeDriver();
return driver;
}

}