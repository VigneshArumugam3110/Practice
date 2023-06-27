package org.testng;

import org.excel.BaseClass;
import org.testng.annotations.Test;

public class Parallel extends BaseClass {
	@Test
	private void test1() {
		browserlaunch("https://www.flipkart.com/");
		System.out.println("flipkart");
	}
	@Test
	private void test2() {
		browserlaunch("https://www.facebook.com/");
		System.out.println("facebook");
	}
	@Test
	private void test3() {
		browserlaunch("https://www.amazon.in/gp/primecentral");
		System.out.println("amazon");
	}
	

}