package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class flipkartBaseClass {


	public static WebDriver driver;	
	
	@BeforeTest 
	public void setup()
	{
		
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();

	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
