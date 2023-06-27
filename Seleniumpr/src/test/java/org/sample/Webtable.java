package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.siteforinfotech.com/handling-static-dynamic-tables-selenium-webdriver/");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tablehead = table.findElements(By.tagName("thead"));
		int headsize = tablehead.size();
		System.out.println(headsize);
		List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		int rowsize = tablerow.size();
		System.out.println(rowsize);
		List<WebElement> tablecolumn = table.findElements(By.tagName("td"));
		int columnsize = tablecolumn.size();
		System.out.println(columnsize);
		WebElement xx = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
		String text = xx.getText();
		System.out.println(text);
		String text2 = tablerow.get(2).getText();
		System.out.println(text2);
		for (int i = 0; i < tablerow.size(); i++) {
			System.out.println(tablerow.get(i).getText());
				}
	}
}
