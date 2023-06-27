package org.junit;

import org.excel.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginpom extends BaseClass{
	public Loginpom() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
	private WebElement username;
	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@id='pas']")})
	private WebElement password;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
		}
	}
