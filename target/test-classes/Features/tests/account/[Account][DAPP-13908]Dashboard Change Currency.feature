#@Android @Ios @Account
Feature: [Account][BAM][DAPP-13908]Dashboard Change Currency
  Description : A generic booking with Login in from the join screen
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page


  
  #@Sanity
  #@DAPP-13908
  #@RETRY_TEST
  @SMOKE_TEST


  
  Scenario: [Account][BAM][DAPP-13908]Dashboard Change Currency
    Given set data path "./data/booking/guestuser/DashboardChangeCurrency.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I navigate to login page
    And I click on the button change currency
    And I search and I change the currency
      | Currency    |
      | ${currency} |
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    #And Step/Page1 =========== "Room Options" ==========
    #And open room options form
    #And I fill room options with "${adultCount}" adults
    #And I confirm room options
    And I do search
    And I select the first hotel
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And I submit summary information presence element
      | emailAdress    | phoneNumber    | CountryRegion       |
      | ${emailAdress} | ${phoneNumber} |${guestCountryRegion}|
    And I verify the changes of currency in the booking and in the booking join
      | CurrencyBooking    |
      | ${currencyBooking} |
