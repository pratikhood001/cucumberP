Feature: Login

Scenario: Successful login with valid credentials
	Given User launch chrome browser
	When user open URL "http://www.testyou.in/Login.aspx"
	And user enter Username as "admin@testyou.com" and Password as "admin"
	And Click on login button.