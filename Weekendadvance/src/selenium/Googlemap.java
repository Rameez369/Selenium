package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlemap {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://googlemaps.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @placeholder='Choose starting point, or click on the map...']")).sendKeys("qspiders rajajinagar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='nhb85d-BIqFsb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-autocomplete='list' and @aria-label='Choose destination...']")).sendKeys("jet lag rajajinagar");
		
		

	}

}

