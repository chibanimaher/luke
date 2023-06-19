#@Android @Ios @Account
Feature: [Account][BAM][DAPP-13884]Dashbord: Redirection to My status screen
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
   #@DAPP-13884  
   @NR_TEST

  
  Scenario: [Account][BAM][DAPP-13884]Redirection to My status screen
    Given set data path "./data/booking/guestuser/StatusScreen.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I go back to Login Page from Home Page
    And I verify and click in status button 
    
