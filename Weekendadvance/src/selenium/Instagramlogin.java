package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagramlogin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='_2hvTZ pexuQ zyHYP']")).sendKeys("dad");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mom");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
