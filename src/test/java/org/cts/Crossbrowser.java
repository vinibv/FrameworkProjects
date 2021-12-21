package org.cts;

import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {

	
	public WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc1(String name) {
		
		if (name.equals("chrome")) {
			
		
		System.out.println("Launch Chrome");

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	else if (name.equals("firefox")) {

        System.out.println("Launch Firefox");
         WebDriverManager.firefoxdriver().setup();
   driver=new FirefoxDriver();

	}

	
	else {
		
		System.out.println("Launch Edge");
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	
	
}

} 
	
	
	
	
	
	