package SeleniumPrograms_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_Selenium 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Kalyan");
		driver.findElement(By.id("email")).sendKeys("Kalyan@gmail.com");	
	}

}
