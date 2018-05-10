package stepDefenition;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import org.testng.annotations.Test;

import com.careEmpowerProject.utils.pageDriver;

import com.careEmpowerProject.*;
import com.careEmpowerProject.Patient_Roster.*;
import com.careEmpowerProject.Quick_Lists.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
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
	    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
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
    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^Click on recurringAction link$")
public void click_on_recurringAction_link() throws Throwable {
    this.hp= new homepage(this.driver);
    this.hp.Click_requiringAction();                    
    Thread.sleep(5000);
    this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
}

@Then("^Recurring Action Page is Opened\\.$")
public void recurring_Action_Page_is_Opened() throws Throwable {
	this.ra= new RecuringAction(this.driver);
	Assert.assertTrue(ra.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on New hospitalizations link$")
public void click_on_New_hospitalizations_link() throws Throwable {
	this.hp= new homepage(this.driver);
    
	this.hp.New_Hospitalization();
	  Thread.sleep(5000);
	
}

@Then("^New hospitalizations Page is Opened\\.$")
public void new_hospitalizations_Page_is_Opened() throws Throwable {
	
    this.nH=new newHospitalization(this.driver);
	Assert.assertTrue(this.nH.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}


@Then("^close$")
public void close() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   this.driver.close();
}

@When("^Click on New ED Visits link$")
public void click_on_New_ED_Visits_link() throws Throwable {
    
	this.hp.newEdVisits();
	  Thread.sleep(5000);
}

@Then("^New ED Visits Page is Opened\\.$")
public void new_ED_Visits_Page_is_Opened() throws Throwable {
	this.nEV=new newEdVisits(this.driver);
	Assert.assertTrue(this.nEV.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on RAFs  link$")
public void Click_on_RAFs_link() throws Throwable {
    
	this.hp.RAFs();
	  Thread.sleep(5000);
}

@Then("^RAFs Page is Opened\\.$")
public void rafs_Page_is_Opened() throws Throwable {
	
	this.raf=new RAFs(this.driver);
	Assert.assertTrue(this.raf.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on Care Gaps link$")
public void click_on_Care_GapsNew_ED_Visits_link() throws Throwable {
    
	this.hp.careGaps();
}

@Then("^Care Gaps Page is Opened\\.$")
public void care_Gaps_Page_is_Opened() throws Throwable {
	
	this.cG=new careGaps(this.driver);
	Assert.assertTrue(this.cG.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on Medication Adherence Visits link$")
public void click_on_Medication_Adherence_Visits_link() throws Throwable {
    
	this.hp.medicationAdherence();
}

@Then("^Medication Adherence Page is Opened\\.$")
public void medication_Adherence_Page_is_Opened() throws Throwable {
	
	this.mA=new medicationAdherence(this.driver);
	Assert.assertTrue(this.mA.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on Appointments link$")
public void click_on_Appointments_link() throws Throwable {
    
	this.hp.appointments();
}

@Then("^Appointments Page is Opened\\.$")
public void appointments_Page_is_Opened() throws Throwable {
    
	this.at=new appointments(this.driver);
	Assert.assertTrue(this.at.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on My Patients  link$")
public void click_on_My_Patients_link() throws Throwable {
    
	this.hp.myPatients();
}

@Then("^My Patients  Page is Opened\\.$")
public void my_Patients_Page_is_Opened() throws Throwable {
	
	this.mP=new myPatients(this.driver);
	Assert.assertTrue(this.mP.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on All Patients link$")
public void click_on_All_Patients_link() throws Throwable {
    
	this.hp.allPatients();
}

@Then("^All Patients  Page is Opened\\.$")
public void all_Patients_Page_is_Opened() throws Throwable {
	
	this.ap=new allPatients(this.driver);
	Assert.assertTrue(this.ap.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on Patient Roster link$")
public void click_on_Patient_Roster_link() throws Throwable {
	
	this.hp = new homepage(this.driver);
	this.hp.mainMenu();
	this.hp.PatientRoster();
}

@Then("^Patient Roster Page is Opened\\.$")
public void patient_Roster_Page_is_Opened() throws Throwable {
    
	this.m_pr= new patientRoste(this.driver);
	Assert.assertEquals(this.m_pr.getElementText(), "Patient Roster");
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on Care Team link$")
public void click_on_Care_Team_link() throws Throwable {
    
	this.hp = new homepage(this.driver);
	this.hp.mainMenu();
	this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	this.hp.CareTeam();
}

@Then("^Care Team Page is Opened\\.$")
public void care_Team_Page_is_Opened() throws Throwable {
	this.m_ct= new careTeam(this.driver);
Assert.assertTrue(this.m_ct.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on Provider Performance link$")
public void click_on_Provider_Performance_link() throws Throwable {
	//this.hp = new homepage(this.driver);
	this.hp.mainMenu();
	this.hp.ProviderPerformance();
}

@Then("^Provider Performance Page is Opened\\.$")
public void provider_Performance_Page_is_Opened() throws Throwable {
	this.m_pp= new providerPerformance(this.driver);
	Assert.assertTrue(this.m_pp.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on My Performance  link$")
public void click_on_My_Performance_link() throws Throwable {
   
	this.hp.mainMenu();
	this.hp.MyPerformance();
	this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@Then("^My Performance Page is Opened\\.$")
public void my_Performance_Page_is_Opened() throws Throwable {
	this.m_mp= new myPerformance(this.driver);
	Assert.assertTrue(this.m_mp.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Click on Administration link$")
public void click_on_Administration_link() throws Throwable {
	this.hp.mainMenu();
    
	this.hp.Administration();
}

@Then("^Administration Page is Opened\\.$")
public void administration_Page_is_Opened() throws Throwable {
	
	this.m_ad= new administration(this.driver);
	Assert.assertTrue(this.m_ad.isDisplayed());
	 this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
// Newly added

@Given("^in Medication Adherence page$")
public void in_Medication_Adherence_page() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 this.hp= new homepage(this.driver);
	 this.hp.medicationAdherence();
}

@When("^clicked on the ‘RX’ on the patient card$")
public void clicked_on_the_RX_on_the_patient_card() throws Throwable {
    
	this.mA= new medicationAdherence(this.driver);
	this.mA.clickRX();
}

@Then("^‘Medication tab’ on patient profile page$")
public void medication_tab_on_patient_profile_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^it should show Current medication mediction History and potential Abuse$")
public void it_should_show_Current_medication_mediction_History_and_potential_Abuse() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^in Appointments page$")
public void in_Appointments_page() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 this.hp= new homepage(this.driver);
	 this.hp.appointments();
}

@When("^appointments present$")
public void appointments_present() throws Throwable {
    this.at= new appointments(this.driver);
    Assert.assertTrue(this.at.isDisplayed());
    
}

@Then("^It should show the present month calendar with number of appointments on the dates$")
public void it_should_show_the_present_month_calendar_with_number_of_appointments_on_the_dates() throws Throwable {
    Assert.assertTrue(this.at.isCalanderNumberOfAppointmentsDisplayed());
}

@When("^clicked on a particular date having number (\\d+)$")
public void clicked_on_a_particular_date_having_number(int arg1) throws Throwable {
    this.at.clickCalanderNumberOfAppointments();
}

@Then("^it should Show  Patient’s cards with corresponding appointment times$")
public void it_should_Show_Patient_s_cards_with_corresponding_appointment_times() throws Throwable {
   Assert.assertTrue(this.at.isPatientCardDisplayed());
}

@When("^clicked on a particular patient name$")
public void clicked_on_a_particular_patient_name() throws Throwable {
    this.at.clickPatientName();
}

@Then("^it should take to their profile page$")
public void it_should_take_to_their_profile_page() throws Throwable {
    
	this.at.isPatientProfileDisplayed();
}

@Then("^Able to create new appointments$")
public void able_to_create_new_appointments() throws Throwable {
    this.at.clickNewAppointments();
}

@Then("^edit the existing appointments$")
public void edit_the_existing_appointments() throws Throwable {
    
	this.at.clickEditAppointments();
}

@Given("^in All Patients page$")
public void in_All_Patients_page() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 this.hp= new homepage(this.driver);
	 this.hp.allPatients();
}

@Then("^Patient card is displaying all the information correctly$")
public void patient_card_is_displaying_all_the_information_correctly() throws Throwable {
    this.ap= new allPatients(this.driver);
    this.ap.isPatientInformation1Displayed();
    this.ap.isPatientInformation2Displayed();
}

@When("^window is resized$")
public void window_is_resized() throws Throwable {
	
	Dimension n= new Dimension(300,500);
    this.driver.manage().window().setSize(n);
}

@Then("^the blue part of Patient card comes below the white part$")
public void the_blue_part_of_Patient_card_comes_below_the_white_part() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^clicked on individual patient name on card$")
public void clicked_on_individual_patient_name_on_card() throws Throwable {
    this.ap.clickPatientName();
}

@Then("^it should take to their corresponding profile$")
public void it_should_take_to_their_corresponding_profile() throws Throwable {
    
	this.ap.isPatientProfileDisplayed();
}

@Given("^in Visibility$")
public void in_Visibility() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 this.hp= new homepage(this.driver);
	 this.hp.mainMenu();
	 this.hp.Administration();
	 this.m_ad= new administration(this.driver);
	 this.m_ad.clickVisibility();
	 
}

@Then("^we seeing all the drop downs with showing up appropriate options$")
public void we_seeing_all_the_drop_downs_with_showing_up_appropriate_options() throws Throwable {
    this.m_ad.isDropDownDisplayed();
}

@Given("^In UserMangement of Administration$")
public void in_UserMangement_of_Administration() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 this.hp= new homepage(this.driver);
	 this.hp.mainMenu();
	 this.hp.Administration();
	 this.m_ad= new administration(this.driver);
	 this.m_ad.clickUserManagement();
}

@Then("^Able to see the ‘SECURITY GRANTS’ button displayed for the users with ‘Admin Role’$")
public void able_to_see_the_SECURITY_GRANTS_button_displayed_for_the_users_with_Admin_Role() throws Throwable {
    this.m_ad.isSecurityGrantsDisplayed();
}

@When("^logged into the application with admin role$")
public void logged_into_the_application_with_admin_role() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^should be able to edit the security grants for other users having ‘Security Grants’ button displayed\\.$")
public void should_be_able_to_edit_the_security_grants_for_other_users_having_Security_Grants_button_displayed() throws Throwable {
    this.m_ad.clickEditSecurityGrants();
}

@Then("^Security grant button should not be displayed for the user \\(with admin role$")
public void security_grant_button_should_not_be_displayed_for_the_user_with_admin_role() throws Throwable {
    Assert.assertFalse(this.m_ad.isSecurityGrantsDisplayed());
}

@Given("^in Care path Template of Administration$")
public void in_Care_path_Template_of_Administration() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 this.hp= new homepage(this.driver);
	 this.hp.mainMenu();
	 this.hp.Administration();
	 this.m_ad= new administration(this.driver);
	 this.m_ad.clickUserManagement();
}

@Then("^Able to create new care path template$")
public void able_to_create_new_care_path_template() throws Throwable {
    
	this.m_ad.clickCarePathTemplate();
}

@Then("^Able to access the existing templates$")
public void able_to_access_the_existing_templates() throws Throwable {
    
	this.m_ad.clickAccessTemplate();
}

@Then("^Able to edit the existing templates$")
public void able_to_edit_the_existing_templates() throws Throwable {
    
	this.m_ad.clickEditTemplate();
}

@Then("^Able to access the existing templates from the Patient profile page and assign the care path$")
public void able_to_access_the_existing_templates_from_the_Patient_profile_page_and_assign_the_care_path() throws Throwable {
    this.m_ad.clickAssignCarePath();
}

@Given("^in Assessment Template of Administration$")
public void in_Assessment_Template_of_Administration() throws Throwable {
	this.pd= new pageDriver();
    this.driver=this.pd.setDriver();
    this.pd.openUrl("http://qa-careempower.healthbi.com/ce-frontend-app/login");
    this.lp= new loginPage(this.driver);
	 lp.login("QAuser1", "password0");
	 this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 this.hp= new homepage(this.driver);
	 this.hp.mainMenu();
	 this.hp.Administration();
	 this.m_ad= new administration(this.driver);
	 this.m_ad.clickAssessmentTemplate();
}

@Then("^Able to create new assessment template$")
public void able_to_create_new_assessment_template() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Able to access the existing one$")
public void able_to_access_the_existing_one() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Able to access the existing template from the patient profile page under Assessment tab$")
public void able_to_access_the_existing_template_from_the_patient_profile_page_under_Assessment_tab() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}