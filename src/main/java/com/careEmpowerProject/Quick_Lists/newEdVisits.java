package com.careEmpowerProject.Quick_Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

public class newEdVisits {
	
	private WebDriver driver;
	private WebElement selectAll;
	
	private WebElement title2;
	
	public newEdVisits(WebDriver driver) {
		
		this.driver=driver;
		
		
		//this.title2=this.driver.findElement(By.id("ce-view-header"));
		this.selectAll=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[4]/div/div/div[1]/div/div[3]"));//change the property if its not working
	}
	
public String getElementText2() {
		
		pageDriver p=new pageDriver();
		return p.getText(this.title2);
	}
public boolean isDisplayed() {
	//this.patient1_checkbox.click();
	boolean t= this.selectAll.isDisplayed();
	return t;
	
	
}


}
