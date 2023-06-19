#@Android @Ios @homepage
Feature: [[Home Page][DAPP-17224] Loyalty Card: Affichage du QR code Gold
  Description : Loyalty Card : display a user informations 
        
  As a client i want to display loyalty card user informations 
  When I click on the loyalty card 
  Then I want to display the user card informations  

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@SMOKE_TEST
  #@Sanity
  #@DAPP-17224
  @NR_TEST
  

  
  Scenario: [Home Page][DAPP-17224] Loyalty Card: Affichage du QR code Gold
    Given set data path "./data/booking/guestuser/ExpirationDateGoldUser.json"
    #And I click in the button accept when opening app
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I click on the card
    And I verify the QR code