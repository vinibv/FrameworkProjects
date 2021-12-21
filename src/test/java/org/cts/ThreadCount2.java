package org.cts;

import org.testng.annotations.Test;

public class ThreadCount2 {


	@Test
	private void tc11() {
		System.out.println(Thread.currentThread().getId()+"TestCase 11");

	}
	
	@Test
	private void tc22 (){
		System.out.println(Thread.currentThread().getId()+"TestCase 22");

	}
	
	@Test
	private void tc33 (){
		System.out.println(Thread.currentThread().getId()+"TestCase 33");

	}

}



// In parallel execution using methods diff thread count result .
// In parallel execution using classes diff thread count result .