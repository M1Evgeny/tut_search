package by.htp.tut.test;

import org.testng.annotations.Test;

import by.htp.tut.steps.Steps;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SearchTest {

	private Steps steps;

	@BeforeClass
	public void beforeClass() {
		steps = new Steps();
		steps.initDriver();
	}

	@Test
	public void f() {
		steps.goToJobs();
		steps.getResults();
	}

	 @AfterClass
	 public void afterClass() {
	 steps.closeStepsDriver();
	 }

}
