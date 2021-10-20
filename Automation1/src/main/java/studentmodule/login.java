package studentmodule;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import studentmodule.loginObj;
public class login {
public WebDriver driver;
public login(WebDriver driver)
{
this.driver=driver;
// TODO Auto-generated constructor stub
}
public void login1() throws IOException
{
Properties p=new Properties();
FileInputStream f1=new FileInputStream("/Users/aumapathi/eclipse-workspace/Automation1/src/main/java/Resources/input.properties");
p.load(f1);

driver.get("https://test.qualicoach.org/?");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
loginObj l = new loginObj(driver);
l.uName().sendKeys(p.getProperty("uname"));
l.pwd().sendKeys(p.getProperty("pwd"));
l.ok().click();
}
}