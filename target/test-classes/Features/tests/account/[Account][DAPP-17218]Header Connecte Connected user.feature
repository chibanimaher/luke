#@Android @Ios @Account
Feature: [Account][DAPP-17218]Header Connecte Connected user
  Description : Header Connecte Connected user
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

 
  #@Sanity
  #@DAPP-17218
  @SMOKE_TEST

  Scenario: [Account][DAPP-17218]Header Connecte Connected user
    Given set data path "./data/booking/guestuser/ConnecteConnectedUser.json"
    #And I click in the button accept when opening app
    And I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I navigate to login page
    And I verify the status Classic on the dashboard page
    And I verify the point reward on the dashboard page
    And I verify and I click on the carte classic
