package com.careEmpowerProject.Quick_Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newHospitalization {
	
private WebDriver driver;
	
	private WebElement selectAll;
	
	private WebElement deselectAll;
	
	private WebElement patient1_checkbox;
	
	
	public newHospitalization(WebDriver driver) {
		
		this.driver= driver;
		
		this.selectAll=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[4]/div/div/div[1]/div/div[3]"));//change the property if its not working
		
		this.deselectAll= this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[4]/div/div/div[1]/div/div[4]"));//change the property if its not working
		
		this.patient1_checkbox= this.driver.findElement(By.id("gwt-uid-3"));
	}
	
	public void clickSelectAll() {
		this.selectAll.click();
	}
	
	public void clickDeselectAll() {
		
		this.deselectAll.click();
	}
	
	public boolean checkPresent() {
		boolean t=this.selectAll.isDisplayed();
		return t;
	}
	
	public boolean checkEnabled() {
		this.patient1_checkbox.click();
		boolean t= this.patient1_checkbox.isSelected();
		return t;
		
		
	}

}
