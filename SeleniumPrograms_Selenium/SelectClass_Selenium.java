package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Selenium 
{
	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropDown = driver.findElement(By.id("country"));
		dropDown.click();
		
		dropDownSelect(dropDown , "India");
		
//		Select select = new Select(dropDown);
//		//select.selectByVisibleText("India");
//		//select.selectByIndex(10);
//		//select.selectByValue("india");
//		
//		List<WebElement> options = select.getOptions();
//		
//		for(int i = 0; i < options.size(); i++)
//		{	
//			// Here directly were not getting text because click method from web element so stored and getting text and do clicking
//			
//			WebElement get = options.get(i); 
//			String value = get.getText();
//			
//			if(value.equalsIgnoreCase("India"))
//				get.click();
//		}
		
		
		
//		for(WebElement option : options)
//		{
//			if(option.getText().equals("India"))
//			{
//				option.click();
//				break;
//			}
//		}
		
			
	}
	
	// If we have multiple select dropdowns in a single page use this logic 
	static void dropDownSelect(WebElement element, String value)
	{
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase(value))
			{
				option.click();
				break;
			}
			
		}
	}

}
