package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kusu kusu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/watch?v=RgzLnmTaCAU' and @class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-icon-button[@id='button']/../../..[@id='top-level-buttons-computed']/ytd-toggle-button-renderer[1]")).click();
		

	}

}
