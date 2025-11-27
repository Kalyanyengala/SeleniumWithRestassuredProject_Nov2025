package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable_Selenium
{
	public static void main(String[] args)      // Logic working as per expectations
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");  
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']//tr"));
		//System.out.println("Total number of rows is :" + rows);
		
		for(int i = 1; i <= rows.size(); i++)
		{
			String name = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+ i +"]/td[1]")).getText();
			System.out.println("Printing Names of tables :" + name);
			
			if(name.equals("Chrome"))
			{
				String cpuValue = driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();			
				
				System.out.println("Printing cpuValue is :" + cpuValue);
				
				
				String mainValue = driver.findElement(By.xpath("//strong[contains(text(),'%')]")).getText();
				
				System.out.println("Printing mainValue is :" + mainValue);
				
				if(mainValue.contains(cpuValue))
				{
					System.out.println("Given cpu values are same ");
				}
				else
				{
					System.out.println("Givenm cpu values are not same");
				}
				
				//break;
			}
			
			if(name.equals("Firefox"))
			{
				String fireFoxValue = driver.findElement(By.xpath("//td[normalize-space()='Firefox']//following-sibling::*[contains(text(),'MB')]")).getText();	
				
				System.out.println("Printing fireFox Value :" + fireFoxValue);
				
				String mainFireFoxValue = driver.findElement(By.xpath("//strong[@class='firefox-memory']")).getText();
				System.out.println("Firefox value is :" + mainFireFoxValue);
				
				if(mainFireFoxValue.contains(fireFoxValue))
				{
					System.out.println("Both values are matching");
				}
				else
				{
					System.out.println("Both values are not matching");
				}
				
				break;
			}
		}
		
	}

}
