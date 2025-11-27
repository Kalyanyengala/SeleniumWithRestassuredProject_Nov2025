package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickersII_Selenium 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();   // Logic working as per expectations 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");  
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		String expDate = "23";
		String expMonth = "Mar";
		String expYear = "2026";
		
		Select month = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		month.selectByVisibleText("Mar");
		
	    Select year =new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
	    year.selectByVisibleText("2026");
	    
	    List<WebElement> allDates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));
	   
	   for(WebElement date : allDates)
	   {
		   String dates = date.getText();
		   
		   if(dates.equals(expDate))
		   {
			   date.click();
			   break;
		   }
	   }		
		
	}

}
