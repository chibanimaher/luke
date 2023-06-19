#Android @Ios @Booking
Feature: [Hotel List] [DAPP-21739] Change Currency
  Description : Intégration Encart Prix_ affichage du libellé -Gestion de la devise
        
  As a client 
  When I want to login with childrens
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@DAPP-14188
  #@NR_TEST
  #@Sanity 
  @SMOKE_TEST


  Scenario: [Hotel List] [DAPP-21739] Change Currency
    Given set data path "./data/booking/guestuser/LibelleCurrency.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Authent" ==========
    When I display Login Page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And Step/Page1 =========== "Search" ==========
    And I navigate to home page
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
   And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I click on the button filter currency
    And I search and I change the payment currency
      | Currency    |
      | ${currency} |
    And I verify the tunisian currency in the price
    Then click on close 
    Then verify the change of currency in the List Hotel
   
