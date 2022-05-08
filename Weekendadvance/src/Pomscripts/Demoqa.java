package Pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa {
	
	
	
	@FindBy(id="firstName")
	private WebElement fname;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	private WebElement radio;
	
	
	
	
	
public Demoqa(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}
	
public void first(String datefname) throws InterruptedException
{
	
Thread.sleep(2000);
fname.sendKeys(datefname);
	}
}

