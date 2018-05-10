package com.careEmpowerProject.Quick_Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

public class allPatients {
	
	private WebDriver driver;
	
	private WebElement title;
	private WebElement selectAll;
	
	private WebElement patientInformation1;
	
	private WebElement patientInformation2;
	
	private WebElement patientName;
	
	private WebElement patientProfile;
	
	public allPatients(WebDriver driver) {
		
		this.driver=driver;
		
		//this.title=this.driver.findElement(By.id(""));
		//change the property if its not working
	}
	
public String getElementText() {
		
		pageDriver p=new pageDriver();
		return p.getText(this.title);
	}
public boolean isDisplayed() {
	this.selectAll=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[4]/div/div/div[1]/div/div[3]"));
	boolean t= this.selectAll.isDisplayed();
	return t;
	
	
}
public boolean isPatientInformation1Displayed() {
	
	this.patientInformation1=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	return pd.isDisplayed(this.patientInformation1);
	
	
}

public boolean isPatientInformation2Displayed() {
	
	this.patientInformation2=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	return pd.isDisplayed(this.patientInformation2);
	
	
}
public void clickPatientName() {
	this.patientName=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	pd.Click(this.patientName);
	
	
}

public boolean isPatientProfileDisplayed() {
	
	this.patientProfile=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	return pd.isDisplayed(this.patientProfile);
	
	
}
}