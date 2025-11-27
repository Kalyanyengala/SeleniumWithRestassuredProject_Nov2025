package SeleniumPrograms_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableWithPageNation_Selenium
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");  
		
		int totalPages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		
		for(int i = 1; i <= totalPages; i++)
		{
			WebElement activePage = driver.findElement(By.xpath("//ul[@id='pagination']//li/a[@class = 'active']"));
			System.out.println("Active page no is : " + activePage.getText());
			activePage.click();
			
			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr")).size();
			System.out.println(rows);
			
			for(int j = 1; j <= rows; j++)
			{
				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+j+"]/td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+j+"]/td[3]")).getText();
				
				System.out.println(name + "  " + price);
			}
			
			String pageNo = Integer.toString(i+1);
			driver.findElement(By.xpath("//ul[@id='pagination']//li/a[@class = '"+ pageNo +"']")).click();
			
		}
	}
	

}
