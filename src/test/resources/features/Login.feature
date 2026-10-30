Feature: Login Feature
  in order to access the homepage
  as a user
  I want to login successfully

  Scenario: login Successfully with valid credentials
    Given the user is on the login page
    When the user enters valid username and password and clicks the login button
    Then the user should be directed to homepag
