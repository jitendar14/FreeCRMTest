Feature: Successful login to FREE CRM site

Scenario: FREE CRM login test scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters username and password
And user clicks on login button
Then user is on Home page
And user logs out





