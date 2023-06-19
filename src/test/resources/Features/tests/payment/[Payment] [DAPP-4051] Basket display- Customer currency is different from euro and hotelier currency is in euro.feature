#Android @Ios @Booking
Feature: [Booking][Guest user][DAPP-4051] test
  Description : Basket display- Customer currency is different from euro and hotelier currency is in euro
        
  As a client 
  When I want to login with childrens
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@DAPP-4051
  #@RETRY_TEST
  @NR_TEST


  
  
  Scenario: [Payment] [DAPP-4051] Basket display- Customer currency is different from euro and hotelier currency is in euro
    Given set data path "./data/booking/guestuser/CustomerCurrency.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And Step/Page1 =========== "Search" ==========
    #And I navigate to home page
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${roomCount}" rooms
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I click on the button filter currency
    And I search and I change the payment currency
      | Currency    |
      | ${currency} |
    And I select the first hotel
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And I submit summary information
    #And I submit summary information presence element
    #  | emailAdress    | phoneNumber    |
    #  | ${emailAdress} | ${phoneNumber} |
    Then I verify the display of the price with the user currency
