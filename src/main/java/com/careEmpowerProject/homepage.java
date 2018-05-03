package com.careEmpowerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	private WebDriver driver;
	
	private WebElement Requiring_Action;
	private WebElement New_Hospitalization;
	private WebElement allPatients;
	
	
	public homepage(WebDriver driver) {
		this.driver=driver;
		
	this.Requiring_Action=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div"));//change the property if required
	this.New_Hospitalization= this.driver.findElement(By.xpath(""));//
	this.allPatients=this.driver.findElement(By.xpath(""));
	
	}
	
	public void Click_requiringAction() {
		this.Requiring_Action.click();
	}
	
	public void New_Hospitalization() {
		this.Requiring_Action.click();
	}

}
