Feature: To Test Feature of DaVita Application With Patient User

Background: User is logged In with patient
Given user navigate to the login page
When user submit username and password
Then user click on login page
Then user should be logged in successfully

Scenario: Verify user is able to play video through education menu
Given user is on patient home page
When click on Education menu
Then click on first video link
Then user is able to play video successfully.

Scenario: Verify user is able to play video through Entertainment menu
Given user is on patent user home page
When click on Entertainment menu
Then click on Go to next education task
And click on first video
Then video wil play successfully




