package org.group;

import org.testng.annotations.Test;

public class ClassA {
	@Test(groups="reg")
	private void test1() {
		System.out.println("ClassA test1");
	}
	@Test(groups= {"reg","smoke"})
	private void test2() {
		System.out.println("ClassA test2");
	}
	@Test(groups="smoke")
	private void test3() { 
		System.out.println("ClassA test3");
	}
	@Test(groups="sanity")
	private void test4() {
		System.out.println("ClassA test4");
	}
	@Test(groups="smoke")
	private void test5() {
		System.out.println("ClassA test5");
	}
	@Test(groups="smoke")
	private void test6() {
		System.out.println("ClassA test6");
	}
}
