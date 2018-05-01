package com.careEmpowerProject.Quick_Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecuringAction {
	
	private WebDriver driver;
	
	private WebElement selectAll;
	
	private WebElement deselectAll;
	
	private WebElement patient1_checkbox;
	
	
	public RecuringAction(WebDriver driver) {
		
		this.driver= driver;
		
		this.selectAll=this.driver.findElement(By.className("Select All"));//change the property if its not working
		
		this.deselectAll= this.driver.findElement(By.className("Deselect All"));//change the property if its not working
		
		this.patient1_checkbox= this.driver.findElement(By.id(""));//add the property
	}
	
	public void clickSelectAll() {
		this.selectAll.click();
	}
	
	public void clickDeselectAll() {
		
		this.deselectAll.click();
	}
	
	public boolean checkEnabled() {
		
		boolean t= this.patient1_checkbox.isEnabled();
		return t;
		
		
	}
	
	

}
