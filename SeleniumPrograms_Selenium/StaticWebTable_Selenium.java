package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable_Selenium 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");  
		
		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[1]")).getText();
		System.out.println(value);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(rows.size());
		
		List<WebElement> cells = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		System.out.println(cells.size());
		
		//Thread.sleep(2000);
		
		for(int i = 2; i <= rows.size(); i++)    // This logic is working as per expectations Getting all data from table
		{
			for(int j = 1; j <= cells.size(); j++)
			{
				String valueOptions = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ i +"]/td["+ j +"]")).getText();
				System.out.print(valueOptions + "  |  ");			
			}
			System.out.println();
			
		}
		
		// Based on condition select data from table 
		
		for(int i = 2; i <= rows.size(); i++)
		{
			for(int j = 1; j <= cells.size(); j++)
			{
				String valueOptions = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ i +"]/td["+ j +"]")).getText();
				
				if(valueOptions.equals("Master In JS"))
				{
					String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ i +"]/td[2]")).getText();
					String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ i +"]/td[4]")).getText();
					String subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ i +"]/td[3]")).getText();
					
					System.out.println(valueOptions + "  " + author + "  " + price + " " + subject);
				}
			}
		}
		
	}
	

}
