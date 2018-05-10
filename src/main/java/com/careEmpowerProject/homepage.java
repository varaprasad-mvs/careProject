package com.careEmpowerProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.careEmpowerProject.utils.pageDriver;

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
	private WebElement mainMenu;
	private WebElement patientRoster;
	private WebElement careTeam;
	private WebElement dashboard;
	private WebElement providerPerformance;
	private WebElement myPerformance;
	private WebElement administration;
	private WebElement title;

	
	
	public homepage(WebDriver driver) {
		this.driver=driver;
		
	this.Requiring_Action=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div"));//change the property if required
	this.New_Hospitalization= this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[3]/div"));//
	this.allPatients=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[4]/div"));
	this.appointments=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[8]/div"));
	this.careGaps=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[6]/div"));
	this.myPatients=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[9]/div"));
	this.newEdVisits= this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[4]/div"));
	this.RAFs=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[5]/div"));
	this.medicationAdherence=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[7]/div"));
	/*this.mainMenu=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div[2]"));
	this.mainMenu.click();
	
	//this.patientRoster=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[1]"));
	//this.careTeam=this.driver.findElement(By.id("Care Team"));
	this.careTeam=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[2]"));
	//this.careTeam.click();
	this.providerPerformance=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[4]"));
	this.dashboard=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[3]"));
	this.myPerformance=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[5]"));
	this.administration=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[6]"));
	
	//this.title= this.driver.findElement(By.id("ce-view-header"));*/
	
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
	
	public void mainMenu() {
		this.mainMenu=this.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div[2]"));
		this.mainMenu.click();
	}
	
	
	public void PatientRoster() {
		this.patientRoster.click();
	}
	
	public void CareTeam() {
		this.careTeam=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[2]"));
		this.careTeam.click();
	}
	
	public void ProviderPerformance() {
		this.providerPerformance.click();
	}
	
	public void MyPerformance() {
		this.myPerformance=this.myPerformance=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[5]"));
		this.myPerformance.click();
	}
	
	public void Administration() {
		this.administration= this.administration=this.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[6]"));
		this.administration.click();
	}
	
	
	public boolean checkpresent() {
		boolean t=this.allPatients.isDisplayed();
		return t;
	}
	
	public String getTittle() {
		String t=this.driver.getCurrentUrl();
		
		return t;
		
	}
public String getElementText() {
		
		pageDriver p=new pageDriver();
		return p.getText(this.title);
	}
}