package com.careEmpowerProject;

import org.testng.annotations.Test;

import com.careEmpowerProject.utils.pageDriver;

import com.careEmpowerProject.*;
import com.careEmpowerProject.Quick_Lists.RecuringAction;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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
	  
	  ra.clickDeselectAll();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  this.pd=new pageDriver();
	 this.driver=pd.setDriver();
	 pd.openUrl("");
	 this.lp= new loginPage(this.driver);
	 lp.login("", "");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 this.hp=new homepage(this.driver);
	 hp.Click_requiringAction();
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
