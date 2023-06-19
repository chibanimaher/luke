#@Android @Ios @Account
Feature: [Home Page][DAPP-17268]Expiration date_Limitless user
  Description : Expiration date_Limitless user
        
  As a client 
  When I want to verify the expiration date of the card
  Then Expiration date of the card user is verified  

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@SMOKE_TEST
  #@Sanity
  #@DAPP-17268
  @NR_TEST
 
  Scenario: [Home Page][DAPP-17268] Expiration date_Limitless user
    Given set data path "./data/booking/guestuser/DateLimitlessUser.json"
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
    And I click on the Limitless card
    And I verify the expiration date of the card
    
    
    
    
