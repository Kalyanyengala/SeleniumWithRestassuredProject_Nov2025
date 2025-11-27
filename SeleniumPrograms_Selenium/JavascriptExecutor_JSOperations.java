package SeleniumPrograms_Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_JSOperations 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']"));
		
		WebElement elementClick = driver.findElement(By.xpath("//input[@id='male']"));
		
		// Highlighting element with red color boarder
		
//		js.executeScript("arguments[0].style.border = '3px solid red'", element);
		
//		File source = element.getScreenshotAs(OutputType.FILE);
//		File target = new File(".\\ScreenShoots\\logo.png");
//		FileUtils.copyFile(source, target);
		
		// Getting Title by using Javascript 
		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		// Clicking 
		
//		js.executeScript("arguments[0].click();", elementClick);
//		Thread.sleep(1000);
		
		// Creating alert 
		
		//js.executeScript("alert('This is my alert...')");
		
		// Refresh page 
		//js.executeScript("history.go(0)");
		
		// Scroll bottom and top 
		
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		
//		Thread.sleep(4000);
//		
//		// Scroll bottom and top 
//		
//		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//		
		// Zoom 
		
		js.executeScript("document.body.style.zoom='50%'");
		
		
		//driver.quit();
		
	}

}
