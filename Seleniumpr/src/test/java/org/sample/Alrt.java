package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alrt {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		// simple
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

		Alert a = driver.switchTo().alert();
		a.accept();
		// confirm
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		a.dismiss();
		// prompt
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		a.sendKeys("vignesh");
		a.accept();

	}
}
