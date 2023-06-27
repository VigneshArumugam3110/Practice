package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	// To find the total no of frames
	List<WebElement> tot = driver.findElements(By.tagName("iframe"));
	
int size = tot.size();
System.out.println(size);
WebElement frame1 = driver.findElement(By.xpath("//div[@class='iframe-container']"));
driver.switchTo().frame(frame1);
WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
driver.switchTo().frame(frame2);
driver.findElement(By.xpath("//div[@class='col-xs-9 col-xs-offset-5']/input")).sendKeys("hello");
}
}
