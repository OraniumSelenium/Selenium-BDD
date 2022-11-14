Feature: Test Balze

Scenario: Login scenario
Given User launch the browser and open a url
When User click login button
And User enter value in username filed "Merlin"
And User enter "123" in password field
And User click on the login button
Then User validate the page title
When user click the first product
And User click Add to cart button
Then User validate the succsess msg