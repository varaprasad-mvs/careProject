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
	
	When Click on Care Gaps link
	Then Care Gaps Page is Opened.
	
	When Click on Medication Adherence Visits link
	Then Medication Adherence Page is Opened.
	
	When Click on Appointments link
	Then Appointments Page is Opened.
	
	When Click on My Patients  link
	Then My Patients  Page is Opened.
	
	When Click on All Patients link
	Then All Patients  Page is Opened.
	
	Then close
	
	 When Click on Patient Roster link
	Then Patient Roster Page is Opened.
	
	
@Test3
Scenario: Able to navigate to all the pages from the Main menu drop down

    Given logged with correct credentials

   
	
	When Click on Care Team link
	Then Care Team Page is Opened.
	
	#When Click on Provider Performance link
	#Then Provider Performance Page is Opened.
	
	When Click on My Performance  link
	Then My Performance Page is Opened.
	
	When Click on Administration link
	Then Administration Page is Opened.
	
	Then close
	
	
@Test4	
Scenario: Making sure, Under Quick Lists ‘RAFs’ is included and  checking the new functionality added as far as possible like :

    Given in RAFs page

    When click on filters 
    Then Condition Categories and Condition Status are present 

    When click on RAF on patient card 
    Then it should take to the patient profile page and RAFs tab with information on it
    Then On the Patient profile page under RAFs tab there should be a Manage Conditions button

    When clicked on Manage conditions button 
    Then it should take to an Evidence management window

@Test
Scenario: Medication Adherence Page :
    
    Given in Medication Adherence page
    When clicked on the ‘RX’ on the patient card
	Then ‘Medication tab’ on patient profile page
	Then it should show Current medication mediction History and potential Abuse

@Test	
Scenario: Appointments Page:
     Given in Appointments page
    When appointments present
    Then It should show the present month calendar with number of appointments on the dates
    When clicked on a particular date having number 3
    Then it should Show  Patient’s cards with corresponding appointment times
    When clicked on a particular patient name
    Then it should take to their profile page
    Then Able to create new appointments 
    Then edit the existing appointments

@Test  
Scenario: All Patients Page:
    Given in All Patients page
    Then Patient card is displaying all the information correctly
    When window is resized
    Then the blue part of Patient card comes below the white part
    When clicked on individual patient name on card
    Then it should take to their corresponding profile 
    
    
@Test	
Scenario: Visibility Groups

    Given in Visibility
    Then we seeing all the drop downs with showing up appropriate options
 

@Test
Scenario: UserManagement

    Given In UserMangement of Administration
    Then Able to see the ‘SECURITY GRANTS’ button displayed for the users with ‘Admin Role’
    #When logged into the application with admin role
    Then should be able to edit the security grants for other users having ‘Security Grants’ button displayed.
    Then Security grant button should not be displayed for the user (with admin role

@Test
Scenario: Administration * Care path Template
     
     Given in Care path Template of Administration
     Then Able to create new care path template
     Then Able to access the existing templates
     Then Able to edit the existing templates
     Then Able to access the existing templates from the Patient profile page and assign the care path 
     
     
    
@Test
Scenario: Administration * Assessment Template
     
     Given in Assessment Template of Administration
     Then Able to create new assessment template
     Then Able to access the existing one
     Then Able to access the existing template from the patient profile page under Assessment tab
     
     
     
	