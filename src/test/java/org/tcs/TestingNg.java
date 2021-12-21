package org.tcs;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingNg {


	public class A {

		@BeforeMethod
		
		public  void starttime() {
			 Date d=new Date();
			 System.out.println(d);
		 
		} 
		
		@AfterMethod
		
		public  void endTime() {
			 Date d=new Date();
			 System.out.println(d);
			 
		}
	@Test
	public void ta1 () {

	System.out.println("Test ta1");

	}

	@Test
	public void ta2() {

	System.out.println("Test ta2");

	}

	}
}
