package org.cts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTesting {

	
	WebDriver driver;
		
		@BeforeClass(alwaysRun=true)
		public void browserLaunch() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();


		}
@BeforeMethod
public void startTime() {

	System.out.println(new Date());
 

}

@AfterMethod
public void endTime() {
	
	System.out.println(new Date());

}



	@Test(groups="Sanity")
	public void checkTitle() {
		
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Shopping"));
		
	
	}
	

	
	
	@Test(groups="Sanity")
	public void searchbox() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hp Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
}