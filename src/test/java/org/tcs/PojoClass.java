package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass  extends Helper{

	//1.Create default constructor 
	
	public PojoClass() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement btnSign;
	
	@FindBy(id="ap_email")
	private WebElement emailBtn;
	
	@FindBy(id="continue")
	private WebElement contBtn;
	
	
	public  WebElement btnSign() {
     return btnSign;
	}
	
	public  WebElement emailBtn() {
	     return emailBtn;
		}
	
	
	public  WebElement  contBtn() {
	     return contBtn;
	
	
}

}
