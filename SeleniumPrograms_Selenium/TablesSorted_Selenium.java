package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TablesSorted_Selenium 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("//select[@id='colors']"));
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		
		List<String> originalList = new ArrayList<>();
		List<String> tempList = new ArrayList<>();
		
		for(WebElement option : options)
		{
			originalList.add(option.getText());
			tempList.add(option.getText());
		}
		
		System.out.println("OriginalList :" + originalList);
		System.out.println("TempList :" + tempList);
		
		
		Collections.sort(tempList);
		
		System.out.println("OriginalList :" + originalList);
		System.out.println("TempList :" + tempList);
		
		
		if(originalList.equals(tempList))
		{
			System.out.println("Table is sorted...");
		}
		else
		{
			System.out.println("Table is not sorted...");
		}
		
	}

}
