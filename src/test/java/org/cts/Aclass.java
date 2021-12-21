package org.cts;

import org.testng.annotations.Test;

public class Aclass {

	
	@Test(groups="Cars")
	public void ta1() {

	System.out.println("Tesla");

	}

	@Test(groups="Bike")
	public void ta2() {

	System.out.println("Yamaha");

	}


}