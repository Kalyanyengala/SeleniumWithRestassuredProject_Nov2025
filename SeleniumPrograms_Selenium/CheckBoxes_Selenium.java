package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_Selenium
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    Thread.sleep(1000);
	    
	   // driver.findElement(By.xpath("//input[@class='form-check-input' and contains(@id,'sunday')]")).click(); ----> Single CheckBox
		
	   List<WebElement> options =  driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));
	   
//	   for(int i = 0; i <= 5; i++)     -----> Selecting first to five elements 
//	   {
//		   //options.get(i).click();
//		   System.out.println(options.get(i).getText());
//	   }
	   
//	   for(int i = 0; i < options.size(); i++)   -------> Selecting based on requirement
//	   {
//		   String text = options.get(i).getAttribute("id");
//		   
//		   if(text.equalsIgnoreCase("sunday") || text.equalsIgnoreCase("saturday"))
//		   {
//			   options.get(i).click();
//		   }
//	   }
	   
//	   int totalCheckBoxes = options.size();     --------> Selects last three boxess
//	   
//	   for(int i = totalCheckBoxes-3; i < totalCheckBoxes; i++)
//	   {
//		   options.get(i).click();
//	   }

	   //driver.findElement(By.id("sunday")).click();
	   
	   List<WebElement> listElements = driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));
	   
	   for(int i = 0; i <= listElements.size(); i++)
	   {
		  // listElements.get(i).click();
		   String values = listElements.get(i).getAttribute("id");
		   
		   if(values.equalsIgnoreCase("monday") || values.equalsIgnoreCase("saturday"))
		   {
			   listElements.get(i).click();
		   }

	   }
	   
	}

}
