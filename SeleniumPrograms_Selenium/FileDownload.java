package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload 
{
	public static void main(String[] args) 
	{			
				
		String location = System.getProperty("User.dir")+ ".\\FileDownload"; 
		
		HashMap mapPreferences = new HashMap();
		mapPreferences.put("download.default_directory", location);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs" , mapPreferences);
		
		WebDriver driver = new ChromeDriver(options);  
				
        driver.get("https://file-examples.com/index.php/sample-images-download/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
		element.click();
				
	}

}
