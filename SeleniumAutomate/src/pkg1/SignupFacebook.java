package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupFacebook 
{
public static void main(String[] args) 
	{
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\mmitt\\OneDrive\\Desktop\\chromedriver.exe"); 
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
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
	Signup.click();	
	
	}
}