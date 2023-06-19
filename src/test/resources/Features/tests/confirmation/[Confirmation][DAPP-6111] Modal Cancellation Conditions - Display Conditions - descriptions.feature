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

  
  
  
  
  
  Scenario: [Confirmation][DAPP-6111] Modal Cancellation Conditions - Display Conditions - descriptions
    Given set data path "./data/confirmation/ConfirmationDisplayCancellationConditions.json"
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
    And I do search
    And I select the first hotel
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And I submit summary information presence element
      | emailAdress    | phoneNumber    | CountryRegion       |
      | ${emailAdress} | ${phoneNumber} |${guestCountryRegion}|
    And Step/Page1 =========== "Payment" ==========
    And I display Booking rate sales and cancellation terms and conditions
    Then I verify that Booking rate sales and cancellation terms and conditions are diplayed