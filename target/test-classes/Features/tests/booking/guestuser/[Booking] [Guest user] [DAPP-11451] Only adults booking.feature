#@Android @Ios @Booking
Feature: [Booking] [Guest user] [DAPP-11451] Only adults booking
  Description : a generic booking with adults
        
  As a Guest 
  When I want to login with adults
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@Sanity
  #@TEST_RETRY
  #@DAPP-11451
  #@SMOKE_TEST
  @xyz

  Scenario: [Booking] [Guest user] [DAPP-11451] Only adults booking
    Given set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    #And I fill room dates
    #  | dateIn    | DateOut    | DateFormat    |
    #  | ${dateIn} | ${dateOut} | ${dateFormat} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
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
