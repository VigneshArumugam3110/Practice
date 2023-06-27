package org.sample;

import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("http://www.amazon.in/");
		
		
		 int array[]= {1,3,6,8,9};
//	int small=Integer.MAX_VALUE;
//for (int i = 0; i < array.length; i++) {
//	if(array[i]<small) {
//		small=array[i];
//	}
//	
//}
//System.out.println(small);
//
//		String s1="i love india";
//		String s2 ="";
//		
//		String[] s3 = s1.split(" ");
//		for (String s4 : s3) {
//		for (int i=s4.length()-1; i>=0 ; i--) {
//			s2=s2+s4.charAt(i)+" ";
//			
//		}
//		}
//		System.out.println(s2);
		int contain=31;
		
	boolean found=false;
	for (int i : array) {
	if (contain==i) {
		found=true;
		}}
	if (found) {
		System.out.println("present");
	}

	}
		
		
	
}



