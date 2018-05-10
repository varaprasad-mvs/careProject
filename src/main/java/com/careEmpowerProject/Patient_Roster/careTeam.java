package com.careEmpowerProject.Patient_Roster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

public class careTeam {
	
	private WebDriver driver;
	
	private WebElement title;
	private WebElement selectAll;
	
	public careTeam(WebDriver driver) {
		
		this.driver=driver;
		
		//this.title=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div[2]"));
		this.selectAll=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div[1]/div/div[3]"));
	}
	
public String getElementText() {
		
		pageDriver p=new pageDriver();
		return p.getText(this.title);
	}
public boolean isDisplayed() {
	//this.patient1_checkbox.click();
	boolean t= this.selectAll.isDisplayed();
	return t;
	
	
}
}
