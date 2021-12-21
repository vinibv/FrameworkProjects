package org.tcs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practicemaven extends Helper {

	
	public static void main(String[] args) throws IOException {
		
		
		browserLaunch();
		loadUrl("https://www.amazon.in/");
		windowsmax();
		currenturl();
		
	PojoClass l=new PojoClass();
	
	clickbtn(l.btnSign());
	fill(l.emailBtn(),getData(4, 0));
	clickbtn(l.contBtn());
	
		
		}
	

	}

