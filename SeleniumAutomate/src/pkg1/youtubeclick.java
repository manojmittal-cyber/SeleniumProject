package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeclick 
{
	public static void main(String[] args) 
	{

		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mmitt\\OneDrive\\Desktop\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		List<WebElement>all=driver.findElements(By.id("video-title"));
		System.out.println("total elements "+all.size());
		all.get(0).click();
		
		for(WebElement e : all)
		{
			if(e.getText().equals("Expected text"))
			{
				e.click();
				break;
			}
		}
	}
}