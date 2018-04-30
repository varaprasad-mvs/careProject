package com.careEmpowerProject.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

}
