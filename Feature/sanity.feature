Feature: Login Action

@Test1
Scenario: Able to login and log out of the application
	Given user in login page 
	When user enter correct login details
	Then Successful login

@Test2
Scenario: Able to navigate through all the quick list pages on ‘Patient Roster’ from main menu.
	Given logged with correct credentials
	
	When Click on recurringAction link
	Then Recurring Action Page is Opened.
	
	When Click on New hospitalizations link
	Then New hospitalizations Page is Opened.
	
	When Click on New ED Visits link
	Then New ED Visits Page is Opened.
	
	When Click on RAFs  link
	Then RAFs Page is Opened.
	
	When Click on Care GapsNew ED Visits link
	Then Care Gaps Page is Opened.
	
	When Click on Medication Adherence Visits link
	Then Medication Adherence Page is Opened.
	
	When Click on Appointments link
	Then Appointments Page is Opened.
	
	When Click on My Patients  link
	Then My Patients  Page is Opened.
	
	When Click on All Patients link
	Then All Patients  Page is Opened.
	
	
@Test3
Scenario: Able to navigate to all the pages from the Main menu drop down
When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Scenario: Making sure, Under Quick Lists ‘RAFs’ is included and  checking the new functionality added as far as possible like :
When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Scenario: Medication Adherence Page :
When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Scenario: All Patients Page:
When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Scenario: Main Menu drop down à Administration tab à Visibility Groups:
When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Scenario: Administration à User management
When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Scenario: Administration à Care path Template
When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Scenario: Administration à Assessment Template
When User LogOut from the Application
	Then Message displayed LogOut Successfully
	