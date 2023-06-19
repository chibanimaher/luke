#@Android @Ios @Booking
Feature: [Payment][DAPP-13376]Manual Online Payment_connected user_Booking 
  Description : a gineric booking with payment control
  
  As a client
  When I want to booking with points- payment at the hotel
  Then my booking can book with points
  


  #@SMOKE_TEST_MOCK
  

  Scenario: [Mock][Payment][DAPP-13376]Manual Online Payment_connected user_Booking 
    Given set data path "./data/payment/MockData.json"
    And I select permission to use data  
    And I allow tracking to use data
    And I accept all conditions
    And I activate notifications 
    And I allow notifications
    And I close ads    
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
    And I continue without connexion
    And Step/Page1 =========== "User Creation Form" ==========
    And I create user with following informations
      | Title         | FirstName         | LastName         | Country         | Nationality         | MobileCountry         | PhoneNumber         | Email         | homeAdress       |postcode        | city       | CountryRegion       |
      | ${guestTitle} | ${guestFirstName} | ${guestLastName} | ${guestCountry} | ${guestNationality} | ${guestMobileCountry} | ${guestPhoneNumber} | ${guestEmail} |${guesthomeAdress}|${guestpostcode}|${guestcity}|${guestCountryRegion}|
    And Step/Page1 =========== "Payment" ==========
    And I fill card informations
      | cardType    | cardCVC    | cardNumber    | cardHolderName    | cardExpiration    | cardExpirationMonth    | cardExpirationYear    |
      | ${cardType} | ${cardCVC} | ${cardNumber} | ${cardHolderName} | ${cardExpiration} | ${cardExpirationMonth} | ${cardExpirationYear} |
    Then I verify that reservation is taken
