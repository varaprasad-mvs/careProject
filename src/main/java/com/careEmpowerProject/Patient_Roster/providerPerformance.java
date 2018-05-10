package com.careEmpowerProject.Patient_Roster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

public class providerPerformance {
	
	private WebDriver driver;
	
	private WebElement applyFilter;
	
	public providerPerformance(WebDriver driver) {
		
		this.driver=driver;
		
		this.applyFilter=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[4]/div[2]"));
	}
	
	public boolean isDisplayed() {
		//this.patient1_checkbox.click();
		boolean t= this.applyFilter.isDisplayed();
		return t;
		
		
	}

}
