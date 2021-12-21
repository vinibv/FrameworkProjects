package org.cts;

import org.testng.annotations.Test;

public class ThreadCount {

	@Test
	private void tc1() {
		System.out.println(Thread.currentThread().getId()+"TestCase 1");

	}
	
	@Test
	private void tc2 (){
		System.out.println(Thread.currentThread().getId()+"TestCase 2");

	}
	
	@Test
	private void tc3() {
		System.out.println(Thread.currentThread().getId()+"TestCase 3");

	}
}
