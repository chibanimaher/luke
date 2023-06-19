#@Android @Ios @Account
Feature: [Account][BAM][DAPP-13883]Dashbord: Classic user
  Description : A generic booking with Login in from the join screen
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page


 
  #@Sanity
  #@DAPP-13883
  #@SMOKE_TEST
  @testmaher
  
  Scenario: [Account][BAM][DAPP-13883]Dashbord: Classic user
    Given set data path "./data/booking/guestuser/ClassicScreen.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I navigate to login page
    And I verify status classic in dashboard client
      | Status    |
      | ${status} |
