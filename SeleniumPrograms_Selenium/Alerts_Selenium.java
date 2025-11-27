package SeleniumPrograms_Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Selenium
{
	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		driver.manage().window().maximize();
//	    driver.get("https://testautomationpractice.blogspot.com/");   // ------> Normal Alerts
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
	    
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); ---> Authenticative Popups 
		
//	    driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
//	    
//	    Thread.sleep(2000);
//	    
//	    driver.switchTo().alert().accept();
	    
//	    driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
//	    
//	    Thread.sleep(2000);
//	    
//	    Alert alert = driver.switchTo().alert();
//	    alert.dismiss();
	    
//	    driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
//	    Thread.sleep(2000);
//	    
//	    Alert alert = driver.switchTo().alert();
//	    Thread.sleep(1000);
//	    
//	    alert.sendKeys("Kalyan");
//	    alert.accept();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
//	    driver.findElement(By.xpath("//button[@id='alertBtn']")).click();	    
//	    Thread.sleep(2000);
//	    driver.switchTo().alert().accept();
	    
//	    driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
//	    Thread.sleep(1000);
//	    driver.switchTo().alert().dismiss();
	    
	    driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
	    
	    Alert alert = driver.switchTo().alert();
	 
	    alert.sendKeys("Kalyan");
	    Thread.sleep(1000);
	    alert.accept();
	    System.out.println(alert);
	 
		
	}

}
