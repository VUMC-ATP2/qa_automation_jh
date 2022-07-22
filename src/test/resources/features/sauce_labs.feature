Feature: Login feature
  As a user,
  I want to have the possibility to log in
  So that I can purchase product
  Scenario: Success login
    Given I have navigate to login page
    When I login with 'standard_user' and 'secret_sauce'
    Then I am successfully logged in

