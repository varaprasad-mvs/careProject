package stepDefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import org.testng.annotations.Test;

import com.careEmpowerProject.utils.pageDriver;

import com.careEmpowerProject.*;
import com.careEmpowerProject.Quick_Lists.RecuringAction;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class sanityTestStep {
	
	private WebDriver driver;
	private pageDriver pd;
	private loginPage lp;
	private homepage hp;
	
	private RecuringAction ra;
	
	@Given("^user in login page$")
	public void user_in_login_page() throws Throwable {
		
	    this.pd= new pageDriver();
	    this.driver=this.pd.setDriver();
	    this.pd.openUrl("https://www.facebook.com/");
	}

@When("^user enter correct login details$")
public void user_enter_correct_login_details() throws Throwable {
	
	this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Then("^Successful login$")
public void successful_login() throws Throwable {
    
}

@When("^User LogOut from the Application$")
public void user_LogOut_from_the_Application() throws Throwable {
    
}

@Then("^Message displayed LogOut Successfully$")
public void message_displayed_LogOut_Successfully() throws Throwable {
    
}



@Given("^logged with correct credentials$")
public void logged_with_correct_credentials() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("https://www.facebook.com/");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^Click on recurringAction link$")
public void click_on_recurringAction_link() throws Throwable {
    this.hp= new homepage(this.driver);
    this.hp.Click_requiringAction();
    
}

@Then("^Recurring Action Page is Opened\\.$")
public void recurring_Action_Page_is_Opened() throws Throwable {
	this.ra= new RecuringAction(this.driver);
    Assert.assertTrue(this.ra.checkPresent());
}

@When("^Click on New hospitalizations link$")
public void click_on_New_hospitalizations_link() throws Throwable {
    
}

@Then("^New hospitalizations Page is Opened\\.$")
public void new_hospitalizations_Page_is_Opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Click on New ED Visits link$")
public void click_on_New_ED_Visits_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^New ED Visits Page is Opened\\.$")
public void new_ED_Visits_Page_is_Opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Click on RAFs  link$")
public void click_on_RAFs_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^RAFs Page is Opened\\.$")
public void rafs_Page_is_Opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Click on Care GapsNew ED Visits link$")
public void click_on_Care_GapsNew_ED_Visits_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Care Gaps Page is Opened\\.$")
public void care_Gaps_Page_is_Opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Click on Medication Adherence Visits link$")
public void click_on_Medication_Adherence_Visits_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Medication Adherence Page is Opened\\.$")
public void medication_Adherence_Page_is_Opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Click on Appointments link$")
public void click_on_Appointments_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Appointments Page is Opened\\.$")
public void appointments_Page_is_Opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Click on My Patients  link$")
public void click_on_My_Patients_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^My Patients  Page is Opened\\.$")
public void my_Patients_Page_is_Opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Click on All Patients link$")
public void click_on_All_Patients_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^All Patients  Page is Opened\\.$")
public void all_Patients_Page_is_Opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}