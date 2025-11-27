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

public class DataProviders_TestNG 
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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
    }    
	
    @Test(dataProvider="TestData")
	public void testMethod(String userName , String password)
	{
		WebElement nameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		nameField.sendKeys(userName);
		
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		emailField.sendKeys(password);
			
		WebElement maleButtonField = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		maleButtonField.click();		
		
	}
   
	
	@AfterMethod
	public void closingPage() throws InterruptedException
	{
		driver.close();
		
	}
	
	@DataProvider(name = "TestData")
	public Object[][] data()
	{
		return new Object[][]
		{
			
			{"Renu@gmail.com" , "Renu@1234"},			
			{"kalyan1999@gmail.com" , "Kalyan"},
			{"Pavan@gmail.com" , "Pavan@1234"},
			{"Sunil@gmail.com" , "Sunil@1234"}
				
		};
	}

}
