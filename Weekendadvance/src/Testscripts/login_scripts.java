package Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Pomscripts.Demoqa;
import selenium.Baseclass;
import selenium.Genericexcel; 

public class login_scripts extends Baseclass {
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Demoqa dm=new Demoqa(driver);
		String firstname=Genericexcel.getdata("Sheet1", 0, 0);
		Thread.sleep(5000);
		//String firstname="ram";
		dm.first(firstname);
		System.out.println(firstname);
		
		
	}
	

	
}
