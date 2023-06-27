package org.sample;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practi {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions action = new Actions(driver);
		action.moveToElement(course).build().perform();

		WebElement bigdata = driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
		bigdata.click();
		WebElement cou = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		action.moveToElement(cou).build().perform();

		WebElement oracl = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		action.moveToElement(oracl).build().perform();
        WebElement train = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		train.click();
		//String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String>eachwindow=new LinkedList<String>(windowHandles);
		//eachwindow.addAll(windowHandles);
		Thread.sleep(2000);
		String Child = eachwindow.get(1);
		driver.switchTo().window(Child);
		WebElement btn = driver.findElement(By.xpath("//a[@id='profile-tab']"));
		btn.click();
		String pp = eachwindow.get(0);
		driver.switchTo().window(pp);
		WebElement cc = driver.findElement(By.xpath("//a[text()='Download Course Content']"));
		cc.click();
		
		}
}
