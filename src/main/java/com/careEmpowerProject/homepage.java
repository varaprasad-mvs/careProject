package com.careEmpowerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	private WebDriver driver;
	
	private WebElement Requiring_Action;
	private WebElement New_Hospitalization;
	private WebElement allPatients;
	private WebElement appointments;
	private WebElement careGaps;
	private WebElement myPatients;
	private WebElement newEdVisits;
	private WebElement RAFs;
	private WebElement medicationAdherence;
	
	
	public homepage(WebDriver driver) {
		this.driver=driver;
		
	this.Requiring_Action=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div"));//change the property if required
	this.New_Hospitalization= this.driver.findElement(By.xpath(""));//
	this.allPatients=this.driver.findElement(By.xpath(""));
	this.appointments=this.driver.findElement(By.xpath(""));
	this.careGaps=this.driver.findElement(By.xpath(""));
	this.myPatients=this.driver.findElement(By.xpath(""));
	this.newEdVisits= this.driver.findElement(By.xpath(""));
	this.RAFs=this.driver.findElement(By.xpath(""));
	this.medicationAdherence=this.driver.findElement(By.xpath(""));
	
	}
	
	public void Click_requiringAction() {
		this.Requiring_Action.click();
	}
	
	public void New_Hospitalization() {
		this.New_Hospitalization.click();
	}
	
	public void allPatients() {
		this.allPatients.click();
	}
	
	
	public void appointments() {
		this.appointments.click();
	}
	
	public void careGaps() {
		this.careGaps.click();
	}
	
	public void myPatients() {
		this.myPatients.click();
	}
	
	public void newEdVisits() {
		this.newEdVisits.click();
	}
	
	public void RAFs() {
		this.RAFs.click();
	}
	
	public void medicationAdherence() {
		this.medicationAdherence.click();
	}
	
	public boolean checkpresent() {
		boolean t=this.allPatients.isDisplayed();
		return t;
	}

}
