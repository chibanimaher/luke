#@Android @Ios @Account
Feature: [Account][BAM][DAPP-13864]Dashbord: Silver user
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
  #@DAPP-13864
  #@SMOKE_TEST
  #@NR_TEST
  @testmaher
  
  Scenario: [Account][BAM][DAPP-13864]Dashbord: Silver user screen
    Given set data path "./data/booking/guestuser/SilverUserScreen.json"
    #And I click in the button accept when opening app
    And I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I navigate to login page
    And I verify the status silver on the dashboard page
