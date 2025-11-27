package SeleniumPrograms_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Selenium 
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
//		WebDriver driver = new ChromeDriver();   
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		driver.manage().window().maximize();
//		//driver.get("https://testautomationpractice.blogspot.com/");  
//		driver.get("https://text-compare.com/");
//		
//		Actions act = new Actions(driver);
		
//		WebElement moveEle = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
//		act.moveToElement(moveEle).perform();
		
//		WebElement doubleClick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
//		act.doubleClick(doubleClick).perform();
//		
//		WebElement dragAndDrop = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement dragAndDropDestiny = driver.findElement(By.xpath("//div[@id='droppable']"));
//		
//		act.dragAndDrop(dragAndDrop, dragAndDropDestiny).perform();
		
//		WebElement source = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
//		WebElement target = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
//		
//		source.sendKeys("kalyan");
//		target.sendKeys("Guru");
		
//		source.sendKeys("welcome to java");
//		
//		act.keyDown(Keys.CONTROL).sendKeys("a");
//		act.keyUp(Keys.CONTROL).perform();
//		act.keyDown(Keys.CONTROL).sendKeys("c");
//		act.keyUp(Keys.CONTROL).perform();
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//		
//		if(source.getAttribute("value").equals(target.getAttribute("value")))
//		{
//			System.out.println("Text coppied successfully");
//		}
//		else
//			System.out.println("Text not coppied successfully ");		
	}
	
	@Test
	public static void actionsMethods() throws InterruptedException
	{
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		//driver.get("https://text-compare.com/");
//		driver.get("https://testautomationpractice.blogspot.com/"); 
//		
//		Actions act = new Actions(driver);
//		
//		WebElement pointElement = driver.findElement(By.xpath("//div[@class='dropdown-content']/a[1]"));
//		Thread.sleep(1000);
//		act.moveToElement(pointElement).perform();
//		
//		WebElement doubleClick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
//		Thread.sleep(2000);
//		act.doubleClick(doubleClick).perform();
		
		
	}

}
