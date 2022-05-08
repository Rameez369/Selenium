package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
public class Baseclass implements Frameconstants{
	public WebDriver driver;
	public WebDriverWait Wait;
	
	@BeforeMethod
	public void  Openapp() {
		System.setProperty(Gecko,Geckovalue);
		driver=new FirefoxDriver();
		Wait=new WebDriverWait(driver,10);
		driver.get(URL);
		
		}
	@AfterMethod
	public void  Closeapp() {
		driver.close();
		
		
	}
	

}
