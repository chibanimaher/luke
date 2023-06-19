#@Android @Ios @Account
Feature: [Booking][Classic user][DAPP-3074] Authentication LCAH account
  Description : the client should login to the app with email and psw.
  
        
  As a client 
  When I login to the app
  Then my account should be logged

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  

  #@Sanity 
  #@DAPP-3074
  @SMOKE_TEST
  Scenario: [Booking][Classic user][DAPP-3074] Authentication LCAH account
    Given set data path "./data/booking/userlogged/BookingWithPoints.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I display Login Page
    And I do login with account information
      | Email    | Password    |
      | ${email} | ${password} |
    And I navigate to login page
    # to do > refacto this method
    Then I verify that login is success
