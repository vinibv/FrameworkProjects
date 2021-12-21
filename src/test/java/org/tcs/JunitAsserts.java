package org.tcs;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class JunitAsserts extends Helper{
	
@BeforeClass
	
	public static  void browser() {
		
		browserLaunch();  
		windowsmax();
	}
	
	
	
	
	@Before
	
	public  void starttime() {
	 Date d=new Date();
	 System.out.println(d);

	}
	
	@After
	public void endtime() {
		System.out.println (new Date());

	}
	

@Test
public void tc1() {
	
	driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	
	Assert.assertTrue("Check title of webpage", title.contains("Facebook"));

	
	
}
@Test

public void tc2() {
	
driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	
	Assert.assertTrue("Check the title of webpage",title.contains("Google"));
	
}

@Test

public void tc3() {
	
driver.get("https://www.facebook.com/");


WebElement userName = driver.findElement(By.id("email"));

userName.sendKeys("Anish");

String actual = userName.getAttribute("value");

Assert.assertEquals("Check Username", "Anish", actual);

}


@Test

public void tc4() {
	
driver.get("https://www.facebook.com/");


WebElement userName = driver.findElement(By.id("email"));

userName.sendKeys("Anish");

String actual = userName.getAttribute("value");

Assert.assertEquals("Check Username", "Balaji", actual);

}



}
