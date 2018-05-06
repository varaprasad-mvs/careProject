package stepDefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import org.testng.annotations.Test;

import com.careEmpowerProject.utils.pageDriver;

import com.careEmpowerProject.*;
import com.careEmpowerProject.Patient_Roster.*;
import com.careEmpowerProject.Quick_Lists.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class smokeTestStep {
	
	private WebDriver driver;
	private pageDriver pd;
	private loginPage lp;
	private homepage hp;
	private RecuringAction ra;
	private newHospitalization nH;
	private allPatients ap;
	private appointments at;
	private careGaps cG;
	private medicationAdherence mA;
	private myPatients mP;
	private newEdVisits nEV;
	private RAFs raf;
	private administration m_ad;
	private careTeam m_ct;
	private myPerformance m_mp;
	private patientRoste m_pr;
	private providerPerformance m_pp;
	
	
	
@Given("^user in login page$")
public void user_in_login_page() throws Throwable {
		
	    this.pd= new pageDriver();
	    this.driver=this.pd.setDriver();
	    this.pd.openUrl("https://www.google.com/");
	}


@When("^user enter correct login details$")
public void user_enter_correct_login_details() throws Throwable {
	
	this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


@Then("^Successful login$")
public void successful_login() throws Throwable {
	this.hp=new homepage(this.driver);
    Assert.assertTrue(this.hp.checkpresent());
}





@Given("^logged with correct credentials$")
public void logged_with_correct_credentials() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("https://www.google.com/");
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
    Assert.assertEquals(this.ra.getElementText(), "Requring Action");
}

@When("^Click on New hospitalizations link$")
public void click_on_New_hospitalizations_link() throws Throwable {
    
	this.hp.New_Hospitalization();
	
}

@Then("^New hospitalizations Page is Opened\\.$")
public void new_hospitalizations_Page_is_Opened() throws Throwable {
	
    this.nH=new newHospitalization(this.driver);
	Assert.assertEquals(this.ra.getElementText(), "New hospitalizations");
}

@When("^Click on New ED Visits link$")
public void click_on_New_ED_Visits_link() throws Throwable {
    
	this.hp.newEdVisits();
}

@Then("^New ED Visits Page is Opened\\.$")
public void new_ED_Visits_Page_is_Opened() throws Throwable {
	this.nEV=new newEdVisits(this.driver);
	Assert.assertEquals(this.nEV.getElementText(), "New ED Visits");
}

@When("^Click on RAFs  link$")
public void Click_on_RAFs_link() throws Throwable {
    
	this.hp.RAFs();
}

@Then("^RAFs Page is Opened\\.$")
public void rafs_Page_is_Opened() throws Throwable {
	
	this.raf=new RAFs(this.driver);
	Assert.assertEquals(this.raf.getElementText(), "RAFs");
}

@When("^Click on Care Gaps link$")
public void click_on_Care_GapsNew_ED_Visits_link() throws Throwable {
    
	this.hp.careGaps();
}

@Then("^Care Gaps Page is Opened\\.$")
public void care_Gaps_Page_is_Opened() throws Throwable {
	
	this.cG=new careGaps(this.driver);
	Assert.assertEquals(this.cG.getElementText(), "Care Gaps");
}

@When("^Click on Medication Adherence Visits link$")
public void click_on_Medication_Adherence_Visits_link() throws Throwable {
    
	this.hp.medicationAdherence();
}

@Then("^Medication Adherence Page is Opened\\.$")
public void medication_Adherence_Page_is_Opened() throws Throwable {
	
	this.mA=new medicationAdherence(this.driver);
	Assert.assertEquals(this.mA.getElementText(), "Medication Adherence");
}

@When("^Click on Appointments link$")
public void click_on_Appointments_link() throws Throwable {
    
	this.hp.appointments();
}

@Then("^Appointments Page is Opened\\.$")
public void appointments_Page_is_Opened() throws Throwable {
    
	this.at=new appointments(this.driver);
	Assert.assertEquals(this.at.getElementText(), "Appointments");
}

@When("^Click on My Patients  link$")
public void click_on_My_Patients_link() throws Throwable {
    
	this.hp.myPatients();
}

@Then("^My Patients  Page is Opened\\.$")
public void my_Patients_Page_is_Opened() throws Throwable {
	
	this.mP=new myPatients(this.driver);
	Assert.assertEquals(this.mP.getElementText(), "My Patients");
}

@When("^Click on All Patients link$")
public void click_on_All_Patients_link() throws Throwable {
    
	this.hp.allPatients();
}

@Then("^All Patients  Page is Opened\\.$")
public void all_Patients_Page_is_Opened() throws Throwable {
	
	this.ap=new allPatients(this.driver);
	Assert.assertEquals(this.ap.getElementText(), "All Patients");
}

@When("^Click on Patient Roster link$")
public void click_on_Patient_Roster_link() throws Throwable {
	
	this.hp.mainMenu();
	this.hp.PatientRoster();
}

@Then("^Patient Roster Page is Opened\\.$")
public void patient_Roster_Page_is_Opened() throws Throwable {
    
	this.m_pr= new patientRoste(this.driver);
	Assert.assertEquals(this.m_pr.getElementText(), "Patient Roster");
}

@When("^Click on Care Team link$")
public void click_on_Care_Team_link() throws Throwable {
    
	this.hp.mainMenu();
	this.hp.CareTeam();
}

@Then("^Care Team Page is Opened\\.$")
public void care_Team_Page_is_Opened() throws Throwable {
	this.m_ct= new careTeam(this.driver);
	Assert.assertEquals(this.m_ct.getElementText(), "Care Team");
}

@When("^Click on Provider Performance link$")
public void click_on_Provider_Performance_link() throws Throwable {
    
	this.hp.mainMenu();
	this.hp.ProviderPerformance();
}

@Then("^Provider Performance Page is Opened\\.$")
public void provider_Performance_Page_is_Opened() throws Throwable {
	this.m_pp= new providerPerformance(this.driver);
	Assert.assertEquals(this.m_pp.getElementText(), "Provider Performance");
}

@When("^Click on My Performance  link$")
public void click_on_My_Performance_link() throws Throwable {
   
	this.hp.mainMenu();
	this.hp.MyPerformance();
}

@Then("^My Performance Page is Opened\\.$")
public void my_Performance_Page_is_Opened() throws Throwable {
	this.m_mp= new myPerformance(this.driver);
	Assert.assertEquals(this.m_mp.getElementText(), "My Performance");
}

@When("^Click on Administration link$")
public void click_on_Administration_link() throws Throwable {
	this.hp.mainMenu();
    
	this.hp.Administration();
}

@Then("^Administration Page is Opened\\.$")
public void administration_Page_is_Opened() throws Throwable {
	
	this.m_ad= new administration(this.driver);
	Assert.assertEquals(this.m_ad.getElementText(), "Admisistration");
}

}
