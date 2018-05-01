package com.careEmpowerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	private WebDriver driver;
	
	private WebElement Requiring_Action;
	
	
	public homepage(WebDriver driver) {
		this.driver=driver;
		
		this.Requiring_Action=this.driver.findElement(By.className("Requiring Action"));//change the property if required
	}
	
	public void Click_requiringAction() {
		this.Requiring_Action.click();
	}

}
