package SeleniumPrograms_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndIFrames_Selenium 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");  
		
		Thread.sleep(4000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(4000);
		WebElement secondFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(secondFrame);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kalyan");
		
		
	}

}
