package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signinfacebook 
{
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		/* WebElement user=driver.findElement(By.id("email")); */
		
		WebElement user=driver.findElement(By.cssSelector("input#email"));
		user.sendKeys("m.mittal87.com");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("manojmittal");		
		
		WebElement login=driver.findElement(By.cssSelector("label#loginbutton"));
		login.click();
		
		/*
		 * System.out.println(System.getProperty("user.dir"));
		 * System.out.println(System.getProperty("user.name"));
		 */
	}
}