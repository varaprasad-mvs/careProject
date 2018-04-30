package com.careEmpowerProject.Quick_Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecuringAction {
	
	private WebDriver driver;
	
	private WebElement selectAll;
	
	private WebElement deselectAll;
	
	
	public RecuringAction(WebDriver driver) {
		
		this.driver= driver;
		
		this.selectAll=this.driver.findElement(By.id(""));//change the property as vaadin plugin
		
		this.deselectAll= this.driver.findElement(By.id(""));//change the property as vaadin
	}
	
	public void clickSelectAll() {
		this.selectAll.click();
	}
	
	public void clickDeselectAll() {
		
		this.deselectAll.click();
	}

}
