package com.careEmpowerProject.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pageDriver {
	
	private WebDriver driver;
	
	
	
	public WebDriver setDriver() {
		
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		 this.driver = new ChromeDriver();
		 
		 return this.driver;
		 
	}
	
	public void openUrl(String URL) {
		this.driver.get(URL);
	}
	
	public void close() {
		this.driver.close();
	}
	
	public String getTittle() {
		String t=this.driver.getCurrentUrl();
		
		return t;
		
	}
	
	public void selectDropDown(WebElement we,String text) {
		
		Select s = new Select(we);
		s.selectByVisibleText(text);
	}
	
public String getText(WebElement we) {
		
		String t= we.getText();
		return t;
	}

}
