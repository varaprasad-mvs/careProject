package com.careEmpowerProject.Quick_Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

public class appointments {
	
	private WebDriver driver;
	
	private WebElement title;
	private WebElement appointments;
	private WebElement patientcard;
	private WebElement patientName;
	
	private WebElement patientProfile;
	
	private WebElement newAppointmentsButton;
	
	private WebElement editAppointmentsButton;
	
	private WebElement calanderNumberOfAppointments;
	
	public appointments(WebDriver driver) {
		
		this.driver=driver;
		
		//this.title=this.driver.findElement(By.id(""));
		this.appointments=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[3]/div/div[1]"));
		
	}
	
public String getElementText() {
		
		pageDriver p=new pageDriver();
		return p.getText(this.title);
	}
public boolean isDisplayed() {
	//this.patient1_checkbox.click();
	boolean t= this.appointments.isDisplayed();
	return t;
	
	
}

public boolean isPatientCardDisplayed() {
	
	this.patientcard=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	return pd.isDisplayed(this.patientcard);
	
	
}

public boolean isPatientProfileDisplayed() {
	
	this.patientProfile=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	return pd.isDisplayed(this.patientProfile);
	
	
}




public boolean isCalanderNumberOfAppointmentsDisplayed() {
	this.calanderNumberOfAppointments=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	return pd.isDisplayed(this.calanderNumberOfAppointments);
	
	
}

public void clickCalanderNumberOfAppointments() {
	this.calanderNumberOfAppointments=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	pd.Click(this.calanderNumberOfAppointments);
	
	
}

public void clickPatientName() {
	this.patientName=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	pd.Click(this.patientName);
	
	
}

public void clickNewAppointments() {
	this.newAppointmentsButton=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	pd.Click(this.newAppointmentsButton);
	
	
}

public void clickEditAppointments() {
	this.editAppointmentsButton=this.driver.findElement(By.xpath(""));
	pageDriver pd= new pageDriver();
	pd.Click(this.editAppointmentsButton);
	
	
}

}