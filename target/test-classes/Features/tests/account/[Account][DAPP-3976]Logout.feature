#@Android @Ios @Account
Feature: [Account][DAPP-3976]Logout
  Description : the client should login to the app with email and psw.
  
        
  As a client 
  When I login to the app
  Then my account should be logged

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout 
    And I go back to the home page  
  
  
  #@Sanity
  #@DAPP-3976
  #@SMOKE_TEST
  #@NR_TEST
  #@testmaher
  Scenario: [Account][DAPP-3976]Logout
    Given set data path "./data/booking/userlogged/BookingWithPoints.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I display Login Page from Home Page
    And I do login with account information
      | Email    | Password    |
      | ${email} | ${password} |
    And Step/Page1 =========== "Search" ==========
    And I go back to the home page 
    And I fill destination with
      | destination    |
      | ${destination} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And I go back to the previous page 
    And I go back to Login Page from Home Page
    And I logout 
    Then I verify that logout is success
    
