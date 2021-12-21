package org.tcs;


import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExample extends Helper {

	@BeforeClass
	
	public static  void browser() {
		
		browserLaunch();
		windowsmax();
	}
	
	
	@AfterClass
	
	public static void closing() {
	
		closingChrome();
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
		
		loadUrl("https://www.amazon.in/");
		PojoClass l=new PojoClass();
		clickbtn(l.btnSign());
		
	}
	
	@Test
	
	
	public void tc3() {
		PojoClass l=new PojoClass();
           clickbtn(l.contBtn());

	}
	
	
	@Test
	
	public void tc2() throws IOException {
		PojoClass l=new PojoClass();
    fill(l.emailBtn(), getData(4, 0));

	}
	

	
	
}


