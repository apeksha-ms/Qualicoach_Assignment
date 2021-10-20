package Qualicoach1.Automation1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



@Test
public class AdminTest {

	public void Qualicoach(){
		System.setProperty("webdriver.chrome.driver", "//Users//aumapathi//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://test.qualicoach.org");
		
		//Find user name
		WebElement txtbx_username= driver.findElement(By.name("username"));
		
		txtbx_username.sendKeys("Admin55");
		
		//password
		driver.findElement(By.name("password")).sendKeys("Admin@6155");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.className("userbutton")).click();
		driver.findElement(By.id("actionmenuaction-1")).click();
		driver.findElement(By.className("administration")).click();
		//driver.findElement(By.xpath("//input[@value='Log in' and @type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Users']")).click(); 
		driver.findElement(By.linkText("Add a new user")).click();
		driver.findElement(By.cssSelector("input[id='id_username']")).sendKeys("user6789");
		driver.findElement(By.cssSelector("span[data-passwordunmask='displayvalue']")).click();
		driver.findElement(By.cssSelector("input[id='id_newpassword']")).sendKeys("user7893");
		driver.findElement(By.xpath("//input[@id='id_firstname']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@id='id_lastname']")).sendKeys("97");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("qtone@abc.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("input[name='submitbutton']")).click();
		
		//edit
		driver.findElement(By.xpath("//i[@class='administration']")).click();
		driver.findElement(By.xpath("//a[text()='Users']")).click(); 
		driver.findElement(By.linkText("Browse list of users")).click();
		driver.findElement(By.cssSelector("input[name='realname']")).click();
		driver.findElement(By.cssSelector("input[id='id_realname']")).sendKeys("user 97");
		driver.findElement(By.cssSelector("input[name='addfilter']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("img[title='Edit']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).click();
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Bangalore");
		driver.findElement(By.cssSelector("input[name='submitbutton']")).click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,1000)");
		
		//delete
		driver.findElement(By.className("administration")).click();
		driver.findElement(By.xpath("//a[text()='Users']")).click(); 
		driver.findElement(By.linkText("Browse list of users")).click();
		driver.findElement(By.cssSelector("input[name='realname']")).click();
		driver.findElement(By.cssSelector("input[id='id_realname']")).sendKeys("user 97");
		driver.findElement(By.cssSelector("input[name='addfilter']")).click();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("img[title='Delete']")).click();
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("input[value='Delete']")).click();
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1000)");
		
		//course
		driver.findElement(By.className("administration")).click();
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs'] /li[3]")).click();
		driver.findElement(By.xpath("//div[@class='span9'] /ul[@class='unstyled'] /li/a")).click();
		driver.findElement(By.xpath("//div[@class='listing-actions course-listing-actions'] /a")).click();
		driver.findElement(By.id("id_fullname")).sendKeys("Automation selenium ");
		driver.findElement(By.id("id_shortname")).sendKeys("selenium");
		WebElement drop1=driver.findElement(By.id("id_startdate_day"));
		Select dropdown1=new Select(drop1);
		dropdown1.selectByValue("20");
		WebElement drop2=driver.findElement(By.id("id_startdate_month"));
		Select dropdown2=new Select(drop2);
		dropdown2.selectByValue("10");
		WebElement drop3=driver.findElement(By.id("id_startdate_year"));
		Select dropdown3=new Select(drop3);
		dropdown3.selectByValue("2022");
		driver.findElement(By.cssSelector("input#id_enddate_enabled")).click();
		System.out.println(driver.findElement(By.cssSelector("input#id_enddate_enabled")).isEnabled());
		driver.findElement(By.id("id_idnumber")).sendKeys("400");
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("div#id_summary_editoreditable")).click();
		driver.findElement(By.cssSelector("div#id_summary_editoreditable")).sendKeys("It contains selenium" );
		js6.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("input#id_saveanddisplay")).click();
		
		//View and download
		
		driver.findElement(By.linkText("Names of resources completed")).click();
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='centerpara'] /a /img[@alt='xls']")).click();
		
		
	
		}
}