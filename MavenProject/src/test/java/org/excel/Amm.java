package org.excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amm throws exception {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.amazon.in/ref=nav_logo");

List<WebElement> list = driver.findElements(By.xpath("//span[@class='icp-nav-link-inner']"));
int size = list.size();
System.out.println(size);
			for (int i = 0; i <list.size(); i++) {
				if (list.get(i).getText().equals(list)) {
					list.get(i).click();
				}
				
}
}
}
