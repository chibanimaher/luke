#@Android @Ios @Account
Feature: [Home Page][DAPP-17266]Expiration date_Classic user
  Description : Expiration date_Classic user
        
  As a client 
  When I want to verify the expiration date of the card
  Then Expiration date of the card user is verified 

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@SMOKE_TEST
  #@Sanity
  #@DAPP-17266
  @NR_TEST
  
  Scenario: [Home Page][DAPP-17264] Expiration date_Classic user
    Given set data path "./data/booking/guestuser/ExpirationDateClassicUser.json"
    #And I click in the button accept when opening app
    And I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    #And I go back to the home page after authentification 
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    #And I click on the Gold card
    And I click on the Classic card
    And I verify the expiration date of the card is not display


