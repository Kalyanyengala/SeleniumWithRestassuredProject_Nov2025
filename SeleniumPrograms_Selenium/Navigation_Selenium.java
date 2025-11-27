package SeleniumPrograms_Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Selenium 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		
//		Thread.sleep(1000);
//		driver.navigate().back();
//		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}

}
