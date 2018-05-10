package com.careEmpowerProject.Patient_Roster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

public class myPerformance {
	
	private WebDriver driver;
	
	private WebElement validateText;
	
	public myPerformance(WebDriver driver) {
		
		this.driver=driver;
		
		this.validateText=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/div/div[3]/div/div[1]/div"));
	}
	
	public boolean isDisplayed() {
		//this.patient1_checkbox.click();
		boolean t= this.validateText.isDisplayed();
		return t;
		
		
	}


}
