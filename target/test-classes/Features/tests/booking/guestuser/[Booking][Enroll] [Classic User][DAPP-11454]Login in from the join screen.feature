#@Android @Ios @Booking
Feature: [Booking][Guest user][DAPP-11454]Login in from the join screen
  Description : A generic booking with Login in from the join screen
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  

  #@Sanity 
  #@TEST_RETRY
  #@RETRY_TEST
  #@DAPP-11454
  #@SMOKE_TEST
  @xyz


  Scenario: [Booking][Guest user][DAPP-11454]Login in from the join screen
    Given set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And Step/Page1 =========== "Confirmation" ==========
    And I display Login Page for authentification  
    And I continue with login connexion
      | Email        | pwd            |  
      | ${userEmail} | ${userPassword}|
    And Step/Page1 =========== "User Creation Form" ==========
    And I submit summary information presence element
      | emailAdress    | phoneNumber    | CountryRegion         |
      | ${emailAdress} | ${phoneNumber} | ${guestCountryRegion} |
    And Step/Page1 =========== "Add Card CVC" ==========
    And I fill card informations
      | cardType    | cardCVC    | cardNumber    | cardHolderName    | cardExpiration    | cardExpirationMonth    | cardExpirationYear    |
      | ${cardType} | ${cardCVC} | ${cardNumber} | ${cardHolderName} | ${cardExpiration} | ${cardExpirationMonth} | ${cardExpirationYear} |
    And Step/Page1 =========== "Payment" ==========
    And I accept general conditions of payment
    Then I verify that reservation is taken
