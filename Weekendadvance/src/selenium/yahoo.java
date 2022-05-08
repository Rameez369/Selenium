package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;

public class yahoo
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.yahoo.com/d/folders/1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("soujusatyam@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("lovemeorhateme143");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='e_dRA l_T cn_dBP cg_FJ k_w r_P A_6EqO u_e69 p_R S_n C_52qC I_ZamTeg D_F H_6VdP gl_C ab_C en_0 M_1Eu7sD it_dRA is_1SUcgJ cZdTOHS_28Otf4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("satyamsouju@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("love letter");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("I Love You");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//img[@src='https://s.yimg.com/ag/images/default_user_profile_pic_32sq.jpg']"));
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='pure-button puree-button-link add-account page-button-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("satyamsouju@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("lovemakesmanweak143");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='icon mail']")).click();

		
		
		
		
		
		

	

	}
}

	


