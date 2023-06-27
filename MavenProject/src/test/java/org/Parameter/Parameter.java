package org.Parameter;

import org.excel.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameter extends BaseClass {
	@Parameters({"User","pass"})
	@Test
	private void loginparameter(String User,String pass) {
		browserlaunch("https://www.facebook.com/");
		findelementid("email").sendKeys(User);
		findelementid("pass").sendKeys(pass);
		
	}
	

}
