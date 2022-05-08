package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitterlogin
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com/");
		Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@dir='auto' and @class='css-901oao r-1awozwy r-1cvl2hr r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@dir='auto' and @class='css-901oao css-bfa6kz r-37j5jr r-1inkyih r-16dba41 r-135wba7 r-bcqeeo r-1pn2ns4 r-95jzfe r-13f91hp r-lrvibr r-qvutc0']")).sendKeys("abrameez6008@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='css-18t94o4 css-1dbjc4n r-sdzlij r-1phboty r-rs99b7 r-ywje51 r-usiww2 r-2yi16 r-1qi8awa r-1ny4l3l r-ymttw5 r-o7ynqc r-6416eg r-lrvibr r-13qz1uu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("rameez456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();
	
	
	
		
		

	}

}
