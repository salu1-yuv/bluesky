package flipkartPagePkg;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.flipkartBaseClass;

public class flipkartPage extends flipkartBaseClass{

	 WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")
	WebElement searchBar;
	
	@FindBy (xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement ADDTOCART;
	
	@FindBy (xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")
	WebElement GoToCart;
	
	@FindBy (xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button")
	WebElement PlaceOrder;
	
	@FindBy (xpath="//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")
	WebElement email;
	
	@FindBy (xpath="//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")
	WebElement Continue;
	
	public flipkartPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search(){
	searchBar.sendKeys("mobilephones",Keys.ENTER);
	}
	
	public void product() {
		product.click();
	}
	public void windowHandler() {
	String parentWindow =driver.getWindowHandle();
		
	Set<String> allWindow =driver.getWindowHandles();
	
	for (String handle : allWindow) {
		if
		(!handle.equalsIgnoreCase(parentWindow)) {
			driver.switchTo().window(handle);
			ADDTOCART.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			GoToCart.click();	
			}
		}
	}
	public void PlaceOrder() {
	PlaceOrder.click();
		}

	public void email() {
		email.sendKeys("salusugathan345@gmail.com");
	}
	
	public void Continue() {
		Continue.click();
	}
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	