package SeleniumPrograms_Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoot_Selenium 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sourc = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File(".\\ScreenShoots\\page.png");
//		
//		FileUtils.copyFile(sourc, target);
//		
//		driver.quit();
		
		// Screenshoot as webelement
		
		WebElement page = driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']"));
		File file = page.getScreenshotAs(OutputType.FILE);
		
        File file1 = new File(".\\ScreenShoots\\page1.png");
		
		FileUtils.copyFile(file, file1);
		driver.quit();
		
		
	}

}
