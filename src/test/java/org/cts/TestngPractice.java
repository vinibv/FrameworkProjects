package org.cts;

import java.io.IOException;
import java.util.Date;

import org.junit.AfterClass;
import org.tcs.FbPojo;
import org.tcs.Helper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngPractice extends Helper{

	@BeforeClass
	
	private void browser() {
	browserLaunch();
	windowsmax();

	}
	
	
	@AfterClass
	
	private void closingbrowser() {
		closingChrome();

	}
	@BeforeMethod
	
	private void startTime() {
	System.out.println(new Date());
	loadUrl("https://www.facebook.com/");

	}
	
	@AfterMethod
	
	private void endTime() {
		System.out.println(new Date());

	}
	
	@Test(priority=-10)            // anish
	 private void tc1() throws IOException, InterruptedException {
		FbPojo f=new FbPojo();
		fill(f.getTxtUser(), getData(5, 0));
		fill(f.getTxtPass(), getData(5, 1));
        clickbtn(f.getLoginBtn());
		Thread.sleep(2000);
	}
	

	@Test(priority=1)   //bala
	 private void tc2() throws IOException, InterruptedException {
		FbPojo f=new FbPojo();
		fill(f.getTxtUser(), getData(6, 0));
		fill(f.getTxtPass(), getData(6, 1));
        clickbtn(f.getLoginBtn());
		Thread.sleep(2000);
	}
	

	@Test(priority=-20,invocationCount=5)     //aaravma
	 private void tc3() throws IOException, InterruptedException {
		FbPojo f=new FbPojo();
		fill(f.getTxtUser(), getData(7, 0));
		fill(f.getTxtPass(), getData(7, 1));
        clickbtn(f.getLoginBtn());
		Thread.sleep(2000);
	}
	
	
	
	
}
