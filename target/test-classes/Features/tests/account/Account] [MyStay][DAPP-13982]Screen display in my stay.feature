#@Android @Ios @Account
Feature: [Account][BAM][DAPP-13982]MyStay:Screen display
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
  #@DAPP-13982
  @NR_TEST
  Scenario: [Account][BAM][DAPP-13882]MyStay:Screen display
    Given set data path "./data/booking/guestuser/ScreenMyStay.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I navigate to login page
    And I click on menu my stay in homepage
    And I check the display of the tabs current passed and cancelled 
     