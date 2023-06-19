#@Android @Ios @Account
Feature: [Confirmation][DAPP-6111] Modal Cancellation Conditions - Display Conditions - descriptions
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
  #@TEST_RETRY
  #@DAPP-6111
  @NR_TEST

  
  
  
  
  
  Scenario: [Confirmation][DAPP-21746] Paiement en ligne_Total_ user connecté_ booking OK_
    Given set data path "./data/booking/guestuser/LogosBrands.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And Step/Page1 =========== "Confirmation" ==========
    And I Click submit in the page  summury
    And Step/Page1 =========== "User Creation Form" ==========
        And Step/Page1 =========== "Payment" ==========
    And I fill card informations
      | cardType    | cardCVC    | cardNumber    | cardHolderName    | cardExpiration    |    
      | ${cardType} | ${cardCVC} | ${cardNumber} | ${cardHolderName} | ${cardExpiration} | 
    Then I verify that reservation is taken
    