package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartlogin
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("mom");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("dad");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL'] ")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
