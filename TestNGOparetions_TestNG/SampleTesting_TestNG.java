package TestNGOparetions_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTesting_TestNG 
{
	WebDriver driver;
	
	@BeforeMethod
	public void startPage()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
	}
	
	@Test
	public void testMethod()
	{
		WebElement nameField = driver.findElement(By.xpath("//input[@id='name']"));
		nameField.sendKeys("Kalyan");
		
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		emailField.sendKeys("Kalyan@gmail.com");
		
		WebElement phoneField = driver.findElement(By.xpath("//input[@id='phone']"));
		phoneField.sendKeys("7337279857");
		
		WebElement textAreaField = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		textAreaField.sendKeys("Welcome to selenium programming");
		
		WebElement maleButtonField = driver.findElement(By.xpath("//input[@id='male']"));
		maleButtonField.click();		
		
	}
	
	@AfterMethod
	public void closingPage()
	{
		driver.close();
		driver.quit();
	}

}
