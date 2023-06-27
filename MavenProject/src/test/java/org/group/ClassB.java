package org.group;

import org.testng.annotations.Test;

public class ClassB {
	@Test(groups="Reg")
	private void test1() {
		System.out.println("ClassB test1");
	}
	@Test(groups="smoke")
	private void test2() {
		System.out.println("ClassB test2");
	}
	@Test(groups="sanity")
	private void test3() {
		System.out.println("ClassB test3");
	}
	



}
