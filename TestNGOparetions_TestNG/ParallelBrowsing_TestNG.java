package TestNGOparetions_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowsing_TestNG 
{
   WebDriver driver;
	
    @BeforeMethod
    @Parameters("browser")
    public void parallelBrowser(String browser)
    {
    	if(browser.equalsIgnoreCase("chrome"))
    	{
    		driver = new ChromeDriver();
    	}
    	if(browser.equalsIgnoreCase("Edge"))
    	{
    		driver = new EdgeDriver();
    	}
    	if(browser.equalsIgnoreCase("fireFox"))
    	{
    		driver = new FirefoxDriver();
    	}
    	
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");		
		
    }    
	
    @Test
	public void testMethod()
	{
		WebElement nameField = driver.findElement(By.xpath("//input[@id='name']"));
		nameField.sendKeys("Kalyan");
		
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		emailField.sendKeys("Kalyan@gmail.com");
		
		WebElement phoneField = driver.findElement(By.xpath("//input[@id='phone']"));
		phoneField.sendKeys("7337279857");
		
		WebElement textAreaField = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		textAreaField.sendKeys("Welcome to selenium programming");
		
		WebElement maleButtonField = driver.findElement(By.xpath("//input[@id='male']"));
		maleButtonField.click();		
		
	}
   
	
	@AfterMethod
	public void closingPage() throws InterruptedException
	{
		Thread.sleep(4000);
		 
		driver.close();
		
	}
	
	@DataProvider(name = "TestData")
	public Object[][] data()
	{
		return new Object[][]
		{
			
			{"kalyan@gmail.com" , "Kalyan@1234"},			
			{"Renu@gmail.com" , "Renu@1234"},
			{"Pavan@gmail.com" , "Pavan@1234"},
			{"Sunil@gmail.com" , "Sunil@1234"}
				
		};
	}

}
