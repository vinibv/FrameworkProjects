package org.tcs;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

public class TestRunner {

	
	@Test
	
	public  void runner() {
		Result r=JUnitCore.runClasses(A.class,B.class);
		

		int runCount = r.getRunCount();
		System.out.println(runCount);
		
		int failureCount = r.getFailureCount();
		System.out.println(failureCount);
		
		int ignoreCount = r.getIgnoreCount();
		System.out.println(ignoreCount);
		
		List<Failure> failures = r.getFailures();
		for (Failure failed : failures) {
			System.out.println(failed);
		}
		
		long runTime = r.getRunTime();
		System.out.println(runTime);
	}
}
