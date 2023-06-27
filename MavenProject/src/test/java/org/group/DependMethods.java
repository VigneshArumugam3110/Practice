package org.group;

import org.testng.annotations.Test;

public class DependMethods {
	@Test
	public void WebStudentLogin()  
	{  
	System.out.println("Student login through web");  
	}  
	@Test  (enabled=false)
	public void MobileStudentLogin()  
	{  
	System.out.println("Student login through mobile");  
	}  
	@Test(dependsOnMethods= {"WebStudentLogin"})  
	public void APIStudentLogin()  
	{  
	System.out.println("Student login through API");  
	}  
}
