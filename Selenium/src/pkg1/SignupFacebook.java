package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupFacebook 
{
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mmitt\\OneDrive\\Desktop\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		/*
		 * WebElement pass=driver.findElement(By.id("pass"));
		 * pass.sendKeys("manrit2011");
		 * 
		 * WebElement login=driver.findElement(By.cssSelector("label#loginbutton"));
		 * login.click();
		 */
	}
}