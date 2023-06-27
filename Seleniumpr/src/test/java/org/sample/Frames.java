package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		// To find the total no of frames
		List<WebElement> tot = driver.findElements(By.tagName("iframe"));
	int size = tot.size();
	System.out.println(size);
	//To switch in to the frame using ID
	driver.switchTo().frame("frame1");
	//To find the locator using tagname:
	driver.findElement(By.tagName("input")).sendKeys("vignesh");
	//Switching to the nested frame
	driver.switchTo().frame("frame3");
	//To click the checkbox:
	driver.findElement(By.xpath("//input[@id='a']")).click();
	//switching out to the frame
	driver.switchTo().defaultContent();
	//switching to another frame
	driver.switchTo().frame("frame2");
	WebElement ddn = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
	Select s =new Select(ddn);
	s.selectByIndex(1);
	List<WebElement> selectedOptions = s.getAllSelectedOptions();
	for (int i = 0; i < selectedOptions.size(); i++) {
		WebElement element = selectedOptions.get(i);
		String text = element.getText();
			System.out.println(text);
			if (text.contains("Baby Cat")) {
				System.out.println("validated");
			}
		}
	}
}
