package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Cookie;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies_Cookie 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
				
		Cookie cookieClass = new Cookie("kalyan" , "12345");
		driver.manage().addCookie(cookieClass);
		driver.manage().deleteCookie(cookieClass);
		
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of the cookies :" + cookies.size());
		
		for(Cookie cooke : cookies)
		{
			System.out.println(cooke.getName() + " " + cooke.getValue());
		}
		
	}

}
