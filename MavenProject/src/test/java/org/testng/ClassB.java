package org.testng;

import org.testng.annotations.Test;

public class ClassB {
	@Test
	private void test1() {
		System.out.println("ClassA test1@Test");
		}
	@Test
	private void test2() {
		System.out.println("ClassA test2@Test");
		}
	@Test
	private void test3() {
		System.out.println("ClassA test3@Test");
		}
	@Test
	private void testC() {
		System.out.println("ClassA testc@Test");
		}
	@Test
	private void testA() {
		System.out.println("ClassA testA@Test");
		}
	@Test
	private void testB() {
		System.out.println("ClassA testb@Test");
		}
}
