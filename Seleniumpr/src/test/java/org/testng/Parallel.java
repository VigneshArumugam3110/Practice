package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	@Test
	private void test1() {
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook opened");
	}
	@Test
	private void test2 () {
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkartopened");
		
	}
	@Test
	private void test3 () {
		driver.get("https://www.amazon.in/");
		System.out.println("amazonopened");
	}
		
	}

	
}


