#@Android @Ios @Account
Feature: [Account][BAM][DAPP-13866]Dashbord: Platinum user
  Description : A generic booking with Login in from the join screen
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page


  #@SMOKE_TEST
  #@Sanity
  #@DAPP-13866
  #@RETRY_TEST
  #@SMOKE_TEST
  @testmaher

  
  Scenario: [Account][BAM][DAPP-13866]Dashbord: Platinum user
    Given set data path "./data/booking/guestuser/PlatinumScreen.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I navigate to login page
    And I verify the screen of dashboard page
      
