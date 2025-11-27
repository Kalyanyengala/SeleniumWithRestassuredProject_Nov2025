package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels_Selenium 
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			driver.manage().window().maximize();
		    driver.get("https://testautomationpractice.blogspot.com/");
		    
		    String parentId = driver.getWindowHandle();
		    System.out.println("Printing parentId :" + parentId);
		    
		    driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
		    
		    Set<String> windowIds =  driver.getWindowHandles();
		    Iterator<String> it = windowIds.iterator();
		    
		    String firstPageId = it.next();
		    String secondPageId = it.next();
		    
		    System.out.println("firstPageId is :" + firstPageId);
		    System.out.println("secondPageId is :" + secondPageId);
		    
//		    for(String win : windowIds)
//		    {
//		    	driver.switchTo().window(win);
//		    	String title = driver.getTitle();
//		    	//System.out.println("Title of the page :" + title);
//		    	
//		    	if(title.equals("merrymoonmary Stock Image and Video Portfolio - iStock"))
//		    	{
//		    		driver.close();
//		    	}
//		    }
		    
		    ArrayList<String> list = new ArrayList<>(windowIds);
		    
		    for(int i = 0; i < list.size(); i++)
		    {
		    	driver.switchTo().window(list.get(i));
		    	System.out.println("Window " + i + " Title: " + driver.getTitle());
		    	
		    	if(list.get(i).equals("merrymoonmary Stock Image and Video Portfolio - iStock"))
		    	{
		    		driver.close();
		    	}
		    }
		    
		    
	
	
	
	}
}
