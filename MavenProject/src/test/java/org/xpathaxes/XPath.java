package org.xpathaxes;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath { 
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Actions actions = new Actions(driver);
		WebElement job = driver.findElement(By.xpath("//div[text()='Job Board']"));
		actions.moveToElement(job).perform();
		driver.findElement(By.xpath("//a[text()='Applications ']")).click();
		WebElement name1 = driver.findElement(By.xpath("//a[text()='Web Editor']//parent::td//preceding-sibling::td//strong"));
		System.out.println(name1.getText());
		List<WebElement> list1 = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding-sibling::td"));
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i).getText());
			}
		List<WebElement> list2 = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding::td"));
		for (int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i).getText());
}
		List<WebElement> list3 = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//following::td"));
		for(int i=0;i<list3.size();i++) {
			System.out.println(list3.get(i).getText());
}
		List<WebElement> list4 = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//following-sibling::td"));
		for(int i=0;i<list4.size();i++) {
			System.out.println(list4.get(i).getText());
}
	 List<WebElement> list5 = driver.findElements(By.xpath("//a[text()='Web Editor']//ancestor::tr//preceding::tr"));
	 for(int i=0;i<list5.size();i++) {
			System.out.println(list5.get(i).getText());
}
	 //to print email
		List<WebElement> list6 = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding::td[@data-colname='E-mail']"));
		 for(int i=0;i<list6.size();i++) {
				System.out.println(list6.get(i).getText());
}
		 // to print name
		 List<WebElement> list7 = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding::td[@class='post-title column-title column-primary']"));
		 for(int i=0;i<list7.size();i++) {
				System.out.println(list7.get(i).getText());
}
		 //to print position
		 List<WebElement> list8 = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding::td[@data-colname='Job']"));
		 for(int i=0;i<list8.size();i++) {
			 System.out.println(list8.get(i).getText());
}
}
}
