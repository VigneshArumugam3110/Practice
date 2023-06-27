package org.sample;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	 
	    public static void main(String[] args) {
//	   	 WebDriverManager.firefoxdriver().setup();
//	 
//	        
//	        FirefoxOptions options = new FirefoxOptions();
//	        options.setHeadless(true);
//	         
//	        WebDriver driver = new FirefoxDriver(options);
//	 
//	        driver.get("https://www.google.com/");
//	        System.out.println("Executing Firefox Driver in Headless mode..\n");
//	 
//	        System.out.println(">> Page Title : "+driver.getTitle());
//	             System.out.println(">> Page URL  : "+driver.getCurrentUrl());
	    	String s ="Seb Console Table";
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.castlery.com/sg/storage/all-storage");
	    List<WebElement> list = driver.findElements(By.xpath("//div[@class='feH33N__bottom");
	    for (int i = 0; i < list.size(); i++) {
			WebElement txt = list.get(i);
			System.out.println(txt.getText());
			if (list.contains(s)) {
				System.out.println("is present");
				
			}
		}
	    }
	 
	
}

