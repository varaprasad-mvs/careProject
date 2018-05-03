package com.careEmpowerProject;

import org.testng.annotations.Test;

import com.careEmpowerProject.utils.pageDriver;

import com.careEmpowerProject.*;
import com.careEmpowerProject.Quick_Lists.RecuringAction;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class sanityTest {
	
	private WebDriver driver;
	private pageDriver pd;
	private loginPage lp;
	private homepage hp;
	
	private RecuringAction ra;
  @Test
  public void sanity() {
	
	this.ra= new RecuringAction(this.driver);
	
	ra.clickSelectAll();
	this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  //Assert.assertTrue(ra.checkEnabled());
	Assert.assertFalse(ra.checkEnabled());
	
	ra.clickDeselectAll();
	this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Assert.assertFalse(ra.checkEnabled());
  }
  @BeforeMethod
  public void beforeMethod() {
	
	this.pd=new pageDriver();
	this.driver=pd.setDriver();
	pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
	this.lp= new loginPage(this.driver);
	lp.login("QAuser1", "password0");
	this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	this.hp=new homepage(this.driver);
	hp.Click_requiringAction();
	this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
  }

  @AfterMethod
  public void afterMethod() {
	driver.close();
	
  }

}
