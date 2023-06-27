package org.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {

public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();		
driver.get("https://demo.guru99.com/test/drag_drop.html");
WebElement dr = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
WebElement dp = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
Actions act = new Actions(driver);
act.dragAndDrop(dr, dp);

}
	
	
	
}
