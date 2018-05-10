package com.careEmpowerProject.Patient_Roster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

public class administration {
	
	private WebDriver driver;
	
	private WebElement selectAll;
	
	private WebElement visibility;
	
	private WebElement dropDown;
	
	private WebElement userManagement;
	
	private WebElement securityGrants;
	
	private WebElement editSecurityGrants;
	
	private WebElement carePathTemplate;
	
	private WebElement AccessTemplate;
	
	private WebElement EditTemplate;
	
	private WebElement assignCarePath;
	
	private WebElement AssesmentTemplate;
	
	private WebElement createNewAssesment;
	
	
	
	public administration(WebDriver driver) {
		
		this.driver=driver;
		
		this.selectAll=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[3]/div/div/div[3]/div"));
	}
	
	public boolean isDisplayed() {
		//this.patient1_checkbox.click();
		boolean t= this.selectAll.isDisplayed();
		return t;
		
		
	}
	
	public void clickVisibility() {
		this.visibility=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		pd.Click(this.visibility);
		
		
	}
	
	public void clickEditTemplate() {
		this.EditTemplate=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		pd.Click(this.EditTemplate);
		
		
	}
	
	public void clickAccessTemplate() {
		this.AccessTemplate=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		pd.Click(this.AccessTemplate);
		
		
	}
	
	public void clickAssessmentTemplate() {
		this.AssesmentTemplate=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		pd.Click(this.AssesmentTemplate);
		
		
	}
	
	public void clickAssignCarePath() {
		this.AccessTemplate=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		pd.Click(this.AccessTemplate);
		
		
	}
	
	public void clickCarePathTemplate() {
		this.carePathTemplate=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		pd.Click(this.carePathTemplate);
		
		
	}
	
	public void clickEditSecurityGrants() {
		this.editSecurityGrants=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		pd.Click(this.editSecurityGrants);
		
		
	}
	
	public void clickUserManagement() {
		this.userManagement=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		pd.Click(this.userManagement);
		
		
	}
	
	public boolean isDropDownDisplayed() {
		
		this.dropDown=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		return pd.isDisplayed(this.dropDown);
		
		
	}
	
public boolean isSecurityGrantsDisplayed() {
		
		this.securityGrants=this.driver.findElement(By.xpath(""));
		pageDriver pd= new pageDriver();
		return pd.isDisplayed(this.securityGrants);
		
		
	}

}