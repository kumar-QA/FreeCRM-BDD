Feature: FreeCRM Delaspage feature 
Scenario: FreeCRM deals p[age test scenario 

	Given enter in to login page 
	Then enter username and password details 
	|bensonneal59@gmail.com|Kumar@59|
	Then click on login button 
	Then user in homepage 
	Then click on Deals link 
	Then click on createBtn 
	Then fill newdealDetails
	|TestData|20|1000|5|
	And close the browser