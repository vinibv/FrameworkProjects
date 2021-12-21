package org.cts;




import java.io.IOException;
import java.util.Date;

import org.tcs.FbPojo;
import org.tcs.Helper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends Helper {

	@BeforeClass
	
	private void browser() {
	browserLaunch();
	loadUrl("https://www.facebook.com/");

	windowsmax();

	}
	
	
	@AfterClass
	
	private void closingbrowser() {
		//closingChrome();

	}
	@BeforeMethod
	
	private void startTime() {
	System.out.println(new Date());

	}
	
	@AfterMethod
	
	private void endTime() {
		System.out.println(new Date());

	}
	
	
	@Parameters({"Chenni","Banglore"})
	@Test
	 private void tc1(@Optional("Balaji")String s1,@Optional("Balaji@123")String s2) throws IOException, InterruptedException {
		FbPojo f=new FbPojo();
		fill(f.getTxtUser(), s1);
		fill(f.getTxtPass(), s2);
        clickbtn(f.getLoginBtn());
		Thread.sleep(2000);
	}

	

	}
	
	
	
	

