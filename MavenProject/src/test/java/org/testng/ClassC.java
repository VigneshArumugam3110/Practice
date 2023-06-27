package org.testng;

import org.testng.annotations.Test;

public class ClassC {
	@Test(priority=-6)
	private void test1() {
		System.out.println("Classc test1 priority=-6");
		}
	@Test(priority=-2)
	private void test2() {
		System.out.println("ClassCtest2 priority=-2");
		}
	@Test
	private void test3() {
		System.out.println("ClassC test3 ");
		}
	@Test(priority=6)
	private void test4() {
		System.out.println("ClassC test4 priority=6 ");
		}
	@Test(priority=10)
	private void test5() {
		System.out.println("ClassC test5 priority=10 ");
		}
	@Test(priority=15)
	private void test6() {
		System.out.println("ClassC test6 priority=15 ");
		}
	@Test(priority=20,invocationCount=15,enabled=true)
	private void test7() {
		System.out.println("ClassC test7 ");
		}
}
