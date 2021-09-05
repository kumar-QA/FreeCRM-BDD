Feature: FreeCRM login feature

#Scenario: FreeCRM login Test Scenario
#Given enter in to login page
#When verify login titlle
#Then enter "bensonneal59@gmail.com" and "Kumar@59" details
#Then click on login button
#Then user should be on homepage
#And close the browser

#Scenario Outline: FreeCRM login Test Scenario
#
#Given enter in to login page
#When verify login titlle
#Then enter "<username>" and "<password>" details
#Then click on login button
#Then user should be on homepage
##And close the browser
#
#Examples:
#	|username|password|
#	|bensonneal59@gmail.com|Kumar@59|
#	|kumar|kumar|
#


#Scenario: FreeCRM test on newcontact page
#Given user already in HomePage
#When click on contactpage link
#Then click on createBtn 
#Then fill thte form

Scenario Outline:FreeCRM newcontactCreat Test Scenario
Given enter in to login page
Then enter "<username>" and "<password>" details
Then click on contactpage link
Then click on createBtn 
Then fill thte form "<fname>"and"<lname>"and"<number>"and"<Email>"
Then close the browser
Examples:
|username|password|fname|lname|number|Email|
|bensonneal59@gmail.com|Kumar@59|k|murali|12345555|murali@gmail.com|
|bensonneal59@gmail.com|Kumar@59|m|chinna|12345555|chinna@gmail.com|
|bensonneal59@gmail.com|Kumar@59|p|kumar|12345555|kumar@gmail.com|