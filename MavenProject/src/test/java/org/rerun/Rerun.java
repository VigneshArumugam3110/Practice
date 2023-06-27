package org.rerun;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Rerun {
	@Test
	private void test1() {
		System.out.println("class test1");
	}
	@Test(retryAnalyzer=Rerun.class)
	private void test2() {
		Assert.assertTrue(false);
		System.out.println("class test2");
	}
	@Test
	private void test3() {
		System.out.println("class test3");
	}
}
