package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers_Selenium 
{
	public static void main(String[] args) throws InterruptedException
	{		
		WebDriver driver = new ChromeDriver();   // Logic working as per expectations 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");  
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		
		String expDate = "23";
		String expMonth = "March";
		String expYear = "2026";
		
		while(true)
		{		
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println("Printing CurrentMonth :" + currentMonth);
			
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			System.out.println("Printing CurrentYear :" + currentYear);
			
			if(currentMonth.equalsIgnoreCase(expMonth) && currentYear.equalsIgnoreCase(expYear))
			{
				break;
			}
			
			else
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}			
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td/a"));
		
		for(WebElement dates : allDates)
		{
			String date = dates.getText();
			
			if(date.equals(expDate))
			{
				dates.click();
				break;
			}
		}
	}

}
