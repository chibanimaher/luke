#@Android @Ios @Account
Feature: [Account][BAM][DAPP-13888]Dashboard - Display STAY PLUS indicator only
  Description : A generic booking with Login in from the join screen
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

 
  #@Sanity
  #@DAPP-13888
  @SMOKE_TEST

  
  
  Scenario: [Account][BAM][DAPP-13888]Dashboard - Display STAY PLUS indicator only
    Given set data path "./data/booking/guestuser/DisplayStayPlusIndicator.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I navigate to login page
    And I see that I have X stay plus
      
