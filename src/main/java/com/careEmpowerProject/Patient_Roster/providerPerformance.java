package com.careEmpowerProject.Patient_Roster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

public class providerPerformance {
	
	private WebDriver driver;
	
	private WebElement title;
	
	public providerPerformance(WebDriver driver) {
		
		this.driver=driver;
		
		this.title=this.driver.findElement(By.id(""));
	}
	
public String getElementText() {
		
		pageDriver p=new pageDriver();
		return p.getText(this.title);
	}

}
