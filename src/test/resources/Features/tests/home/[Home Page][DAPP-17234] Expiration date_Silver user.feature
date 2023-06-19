#@Android @Ios @Account
Feature: [[Home Page][DAPP-17234] Expiration date_Silver user
  
  As a client
  When I want to check the expiry date card 
  Then Expiry date is displayed at the bottom of the card

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  
  
 #@SMOKE_TEST
 #@Sanity
 #@DAPP-17234
 @NR_TEST
  
  
  Scenario: [Home Page][DAPP-17234] Expiration date_Silver user
    Given set data path "./data/booking/guestuser/ExpirationDatesilverUser.json"
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
    And I click on the Silver card
    And I verify the expiration date of the card