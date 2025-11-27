package SeleniumPrograms_Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Selenium 
{
	public static void main(String[] args) throws IOException 
	{		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
	    driver.get("http://www.deadlinkcity.com/");
	    int brokenLinks = 0;
//	    
//	    List<WebElement> links = driver.findElements(By.tagName("a"));
//	    
//	    for(WebElement link : links)
//	    {
//	    	String text = link.getText();
//	    	String url = link.getAttribute("href");
//	    	System.out.println(url);	   
//	    	
//	    	if(url == null || url.isEmpty())
//	    	{
//	    		System.out.println("Links are empty ");
//	    		continue;
//	    	}
//	    	
//	    	 URL UrlObject = new URL(url);
//	    	 
//	    	HttpURLConnection con = (HttpURLConnection)UrlObject.openConnection();
//	    	con.connect();
//	    	
//	    	if(con.getResponseCode() >= 400)
//	    	{
//	    		System.out.println(con.getResponseCode()+ url + "-----> Links are broken links");
//	    		brokenLinks++;
//	    	}
//	    	
//	    	else
//	    	{
//	    		System.out.println(con.getResponseCode() + url + "----> Links are normalLinks");
//	    	}
//	    }
//	    
//	    System.out.println("Broken links are :" + brokenLinks);
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		driver.manage().window().maximize();
//		driver.get("http://www.deadlinkcity.com/");
//		int brokenLinks = 0;
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		
//		for(WebElement link : links)
//		{
//			String pageLinks = link.getAttribute("href");			
//			//System.out.println(pageLinks);
//			
//			if(links.isEmpty() || links == null)
//			{
//				System.out.println("This links are empty or null links");
//				continue;
//			}
//			
//			URL urls = new URL(pageLinks);
//			
//			HttpURLConnection con = (HttpURLConnection) urls.openConnection();
//			con.connect();
//			
//			if(con.getResponseCode() >= 400)
//			{
//				System.out.println("This links are broken links:" + pageLinks + "--->" + con.getResponseCode());
//				brokenLinks++;
//			}
//			else
//			{
//				System.out.println("This links are normal links:" + pageLinks + "--->" + con.getResponseCode());
//			}
//		}
//		
//		System.out.println("Broken links are :" + brokenLinks);		
	    
	    List<WebElement> tagElements = driver.findElements(By.tagName("a"));
	    
	    for(WebElement elements : tagElements)
	    {
	    	String pageLinks = elements.getAttribute("href");
	    	System.out.println("Page links are :" + pageLinks);
	    	
	    	if(pageLinks.isEmpty() || pageLinks == null)
	    	{
	    		System.out.println("This links are empty or null links :" + pageLinks);
	    		continue;
	    	}
	    	
	    	URL httpLinks = new URL(pageLinks);
	    	HttpURLConnection httpConnection = (HttpURLConnection)httpLinks.openConnection();
	    	httpConnection.connect();
	    	
	    	if(httpConnection.getResponseCode() >= 400)
	    	{
	    		System.out.println("This links are brokenLinks :" + pageLinks+"===>"+httpConnection.getResponseCode());
	    		brokenLinks++;
	    	}
	    	else
	    	{
	    		System.out.println("This links are normalLinks :" + pageLinks+"===>"+httpConnection.getResponseCode());
	    	}
	    }
	    System.out.println("Total BrokenLinks are ====>" + brokenLinks);	    
	}
}
