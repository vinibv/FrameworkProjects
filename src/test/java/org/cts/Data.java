package org.cts;

import org.testng.annotations.DataProvider;

public class Data {

	
	@DataProvider(name="FbLogin")
	
public Object[][]gettingData(){
		
		
		return new Object[][] {
			{"abc","abc@123"},
			{"xyz","xzy@123"},
			
			
			
		};
		
}
}