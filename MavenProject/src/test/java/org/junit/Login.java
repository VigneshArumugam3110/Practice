package org.junit;

import org.excel.BaseClass;
import org.openqa.selenium.WebElement;

public class Login extends BaseClass {
	public static void main(String[] args) {
		browserlaunch("https://www.facebook.com/");
	Loginpom a= new Loginpom();
	long start = System.currentTimeMillis();
	System.out.println(start);
	WebElement username = a.getUsername();
	username.sendKeys("hello");
	
	WebElement password = a.getPassword();
	password.sendKeys("manual");
	driver.navigate().refresh();
	username.sendKeys("hello123");
	password.sendKeys("man");
	}

	
}