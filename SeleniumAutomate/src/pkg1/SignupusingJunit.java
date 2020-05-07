package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupusingJunit 
{
	ChromeDriver driver;
	@Before
	public void Browserlaunch() throws InterruptedException
	{	
		System.setProperty("Webdriver.chrome.silentOutput","true");
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mmitt\\OneDrive\\Desktop\\chromedriver.exe"); 
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
	}	
	@Test
	public void EnterDetials()
	{
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement fname= driver.findElement(By.name("firstname"));
		fname.sendKeys("Aksh");
		
		WebElement lname= driver.findElement(By.name("lastname"));
		lname.sendKeys("Mittal");

		WebElement mail= driver.findElement(By.name("reg_email__"));
		mail.sendKeys("m.mittal87@gmail.com");

		WebElement mailconf= driver.findElement(By.name("reg_email_confirmation__"));
		mailconf.sendKeys("m.mittal87@gmail.com");
		
		WebElement pwd= driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("mittal");
		
		WebElement drop=driver.findElement(By.name("birthday_day"));
		Select s=new Select(drop);
		s.selectByIndex(11);
		
		WebElement drop1=driver.findElement(By.name("birthday_month"));
		Select s1=new Select(drop1);
		s1.selectByVisibleText("Oct");
		
		WebElement drop2=driver.findElement(By.name("birthday_year"));
		Select s2=new Select(drop2);
		s2.selectByValue("2013");
		
		WebElement Gender=driver.findElement(By.cssSelector("label[for='u_0_7']"));
		Gender.click();
		
		WebElement Signup=driver.findElement(By.cssSelector("button#u_0_13"));
		//WebDriverWait w=new WebDriverWait(driver, 5);
		//w.until(ExpectedConditions.elementToBeClickable(Signup));
		//w.until(ExpectedConditions.textToBePresentInElement(Signup, "signup"));
		//w.until(ExpectedConditions.visibilityOf(Signup));
		Signup.click();	
	}
	@After
	public void CloseBrowser()
	{
		//System.out.println("abc");
		driver.close();
	}
}