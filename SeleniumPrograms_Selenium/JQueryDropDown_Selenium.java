package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDown_Selenium
{	
    static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		JQueryDropDown_Selenium js = new JQueryDropDown_Selenium();
		//js.selectElements(driver, "choice 2");
		//js.selectElements(driver, "choice 2" , "choice 3", "choice 7");
		//js.selectElements(driver, "all");
		//js.checkBoxes(driver, "choice 2");
		//js.checkBoxes(driver, "choice 2" , "choice 3", "choice 7");
		//js.checkBoxes(driver, "all");

		js.clickCheckBoxes(driver, "choice 2");
//		js.clickCheckBoxes(driver, "choice 2" , "choice 3", "choice 7");
//		js.clickCheckBoxes(driver, "all");
		
		
		
	}
	
//	void selectElements(WebDriver driver, String...value)
//	{
//		List<WebElement> allElements = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//	    
//		if(!value[0].equalsIgnoreCase("all"))
//		{
//			for(WebElement element : allElements)
//			{
//				String values = element.getText();
//				
//				for(String val : value)
//				{
//					if(values.equals(val))
//					{
//						element.click();
//						break;
//					}
//				}
//			}
//		}
//		
//		else
//		{
//			for(WebElement element : allElements)
//			{
//				element.click();
//			}
//		}	
//	}
	
//	void checkBoxes(WebDriver driver , String...value)
//	{
//		List<WebElement> allElements = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		
//		if(!value[0].equalsIgnoreCase("all"))
//		{			
//			for(WebElement element : allElements)
//			{
//				String text = element.getText();
//				
//				for(String val : value)
//				{
//					if(text.equals(val))
//					{
//						element.click();
//						break;
//					}
//				}
//			}
//			
//		}	
//		
//		else
//		{
//			for(WebElement element : allElements)
//			{
//				element.click();
//			}
//		}
//		
//	}
	
	void clickCheckBoxes(WebDriver driver , String...value)
	{
		List<WebElement> allElements = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement element : allElements)
			{
				String text = element.getText();
				
				for(String val : value)
				{
					if(text.equals(val))
					{
						element.click();
						break;
					}
				}
			}
		}
		
		else
		{
			for(WebElement element : allElements)
			{
				element.click();
			}
		}
	}	
}
