package SeleniumPrograms_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display_EnabledElements_Selenium 
{	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement element = driver.findElement(By.id("name"));
		WebElement ele = driver.findElement(By.id("male"));
		
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(ele.isSelected());
		
	}
	
}
