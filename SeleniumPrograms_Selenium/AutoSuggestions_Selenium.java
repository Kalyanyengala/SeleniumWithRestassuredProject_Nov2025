package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions_Selenium
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Auto Suggestions :
		
		/*     Important : For getting autosuggested elements from dropdown
		 *     Use console tab --> write script like : setTimeout(()=>{debugger;},5000) 
		 *     How to use correctly this script : 
		 *     1. Write script in console tab
		 *     2. Goto search box in web page and search product it opens suggestions you will do this search product 
		 *     within time as you mentioned in script --> 5000 - 5 seconds do it this time once timeout page will be
		 *     Blur get what required elements .
		 */
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
	    driver.get("https://www.google.com/?zx=1757930833474&no_sw_cr=1");
		
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		searchBox.click();
		Thread.sleep(3000);
		
		searchBox.clear();
		Thread.sleep(5000);
		
		searchBox.sendKeys("selenium");////div[@class='xZCRiQ']//div[@text='oneplus mobile 5g']
		Thread.sleep(5000);
		
//		List<WebElement> listOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
//		
//		for(WebElement options : listOptions)
//		{
//			
//			String text = options.getText();
//			System.out.println(text);
//			
//			if(options.getText().toLowerCase().contains("interview questions for experienced"))
//			{
//				options.click();
//				break;
//			}
//			
//		}

		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']//span"));
		Thread.sleep(2000);
		
		for(WebElement option : options)
		{
			String value = option.getText();
			System.out.println(value);
			
			if(value.contains("interview questions for experienced"))
			{
				option.click();
				break;
			}

		}
	}

}
