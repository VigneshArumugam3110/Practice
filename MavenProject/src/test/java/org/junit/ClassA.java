package org.junit;

import org.excel.BaseClass;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ClassA extends BaseClass{
	@Test
	public void test1() {
		browserlaunch("https://www.facebook.com/");
		WebElement user = findelementid("email");
		user.sendKeys("hello");
		String attribute = user.getAttribute("value");
		//Assert.assertTrue(attribute.equals("hello"));
		//Assert.assertEquals("hello", attribute);
		Assert.assertEquals("fb", "hello", attribute);
		System.out.println("test1 ");
		break();
	}
}
