Feature: To Test Feature of DaVita Application With Admin User

Background: User is logged In with admin
Given user navigate to the login page and select admin
When user submit username and password under admin
#Then user click on login page
Then user should be logged in successfully under admin

Scenario: Validate user is able to create a new custom user
Given user is on admin home page
When user click on manage users menu
Then click on +newUser tab
And create a new user page will appear
Then provide custom details as per require in page
Then click on save user button

