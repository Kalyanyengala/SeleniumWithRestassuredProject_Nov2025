package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Selenium
{
	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		
		// ImplicitWait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");  
			
		
//		WebElement email = driver.findElement(By.id("name"));
//		email.sendKeys("Kalyan");
//		
//		WebElement password  = driver.findElement(By.id("email"));
//		password.sendKeys("Kalyan");
		
		By locator = By.id("name");
		
		WebElement elementLocator = gettingElementWithFluentWait(driver , locator);   // ---> User defined method
		//elementLocator.sendKeys("Kalyan");
		
		WebElement elementLocatorWait = gettingElementWithExplicitWait(driver, locator, 10);  // ---> User defined method
		elementLocatorWait.sendKeys("Kalyan");
		
		// ExplicitWait
		
//		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		
//		By eleLocator = By.id("name");
//		WebElement eleMent = elementFoundUsingWithFluentWait(driver , eleLocator);
//		
//		WebElement ele = elementFound(driver , eleLocator , 10);
		
//		Wait<WebDriver> wait = new FluentWait<>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);	
		
//		Wait<WebDriver> wait = new FluentWait<>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))		
//				.ignoring(Exception.class);               // -----> Super class of exception
//        //		.ignoring(NoSuchElementException.class);   -------> If you know exception
//		
//		// Usage Of FluentWait 
//		
//		wait.until(new Function<WebDriver , WebElement>()
//		{
//			public WebElement apply(WebDriver driver)
//			{
//				return driver.findElement(By.id("name"));
//			}	
//		});
//			
		
	}
	
	// UserDefinedMethod
	
//	public static WebElement elementFound(WebDriver driver, By locator, int timeOut)
//	{
//		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
//		mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		
//		return driver.findElement(locator);		
//	}
	
//	public static WebElement elementFound(WebDriver driver , By locator, int timeOut)
//	{
//		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
//		mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		
//		return driver.findElement(locator);
//	}
	
//	public static WebElement elementFoundUsingWithFluentWait(WebDriver driver , final By locator)
//	{
//		Wait<WebDriver> mywait = new FluentWait<>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(Exception.class);
//		
//		WebElement element = mywait.until(new Function<WebDriver , WebElement>()
//		{
//			public WebElement apply(WebDriver driver)
//			{
//				return driver.findElement(locator);
//			}		
//		});
//		
//		return element;
//	}
	
	// WebDriver Wait 
	
	public static WebElement gettingElementWithExplicitWait(WebDriver driver , By locator , int timeOut)
	{
		WebDriverWait mywait = new WebDriverWait(driver , Duration.ofSeconds(timeOut));
		mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
	}
	
	// FluentWait 
	
	public static WebElement gettingElementWithFluentWait(WebDriver driver , final By locator)
	{
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
		
		WebElement element = wait.until(new Function<WebDriver , WebElement>(){
			
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(locator);
			}
			
		});
		
		return element;
	}	
}
