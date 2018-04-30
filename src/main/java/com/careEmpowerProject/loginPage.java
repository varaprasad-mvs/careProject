package com.careEmpowerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	private WebDriver driver;
	
	private WebElement Username;
	
	private WebElement Password;
	
	private WebElement LOGIN_button;
	
	private WebElement Forgot_Password;
	
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
		
		this.Username=this.driver.findElement(By.id(""));//change the property as vaadin
		
		this.Password=this.driver.findElement(By.id(""));//change the property as vaadin
		
		this.LOGIN_button=this.driver.findElement(By.id(""));//change the property as vaadin
		
		this.Forgot_Password=this.driver.findElement(By.id(""));//change the property as vaadin
	}
	
	public void login(String uName,String password) {
		
		this.Username.sendKeys(uName);
		
		this.Password.sendKeys(password);
		
		this.LOGIN_button.click();
	}

}
