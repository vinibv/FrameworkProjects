package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.tcs.Helper;

public class FbPojo extends Helper {

	
	
	public FbPojo() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBys({
		
	@FindBy(id="email"),
	@FindBy(xpath="//input[@type='text']")
		
	})
	
	private WebElement txtUser;
	
	
	@FindAll({
		
		
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@name='pass']")
		
		
	})
	
	private WebElement txtPass;

	
	@FindBy(xpath="//input[@name='pass']")
	
	
	
	private WebElement loginBtn;


	public WebElement getTxtUser() {
		return txtUser;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
