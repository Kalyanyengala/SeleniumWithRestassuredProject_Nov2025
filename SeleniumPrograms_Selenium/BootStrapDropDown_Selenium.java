package SeleniumPrograms_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown_Selenium
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");
		
		driver.findElement(By.xpath("//div[@class='product-tabs-wrap product-category-wrap']")).click();
		
		List<WebElement> productTypes = driver.findElements(By.xpath("//div[@class='product-tabs-wrap product-category-wrap']//ul//li"));
		System.out.println(productTypes.size());
				
		driver.findElement(By.xpath("//div[@class='dropdown-active-item product-name-active']")).click();
		
		List<WebElement> product = driver.findElements(By.xpath("//ul[@id='productName']//li"));
		System.out.println(product.size());
		
		getProducts(productTypes , "Housing Loans");
		getProducts(product, "Home Loans");
		
	}
	
	public static void getProducts(List<WebElement> options, String value)
	{		
		for(WebElement option : options)
		{
			if(option.getText().equals(value))
				{
				   option.click();
				   break;
				}
		}	
	}
	

}
