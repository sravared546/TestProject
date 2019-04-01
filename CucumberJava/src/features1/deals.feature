Feature: Deal data creation

Scenario: Free CRM crete a new scenario

Given User is alredy in login page
When title of login page is free crm
Then user enters username and password
|sravan|reddy|
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
|test deal| 1000 | 50 | 30|
Then close the browser


