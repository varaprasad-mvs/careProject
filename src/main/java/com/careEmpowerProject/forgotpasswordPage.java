package com.careEmpowerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotpasswordPage {
	
	private WebDriver driver;
	
	private WebElement Username_or_Email;
	
	private WebElement REQUEST_PASSWORD;
	
	private WebElement Back;
	
	
	public forgotpasswordPage(WebDriver driver) {
		
		this.driver= driver;
		
		this.Username_or_Email= this.driver.findElement(By.id(""));//change the property as vaadin
				
		this.REQUEST_PASSWORD= this.driver.findElement(By.id(""));//change the property as vaadin
		
		this.Back= this.driver.findElement(By.id(""));//change the property as vaadin
	}
	
	public void REQUEST_PASSWORD(String userNameOrEmail) {
		
		this.Username_or_Email.sendKeys(userNameOrEmail);
		
		this.REQUEST_PASSWORD.click();
	}
	
	public void Back() {
		
		this.Back.click();
	}

}
