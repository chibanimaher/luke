#@Android @Ios @Booking
Feature: [Payment][DAPP-13375]Payment at the Hotel_Guest_Booking OK_Optional Warranty_Switch ON
  Description : a generic booking with Payment at the Hotel_Guest_Booking OK_Optional Warranty_Switch ON
        
  As a Guest 
  When I want to login with adults
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  
  #@Sanity
  #@SMOKE_TEST
  #@DAPP-13375
  #@RETRY_TEST
  @NR_TEST

  
  
  

  Scenario: [Payment][DAPP-13375]Payment at the Hotel_Guest_Booking OK_Optional Warranty_Switch ON
    Given set data path "./data/booking/guestuser/BookingOK_OptionalWarranty_SwitchON.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    #And Step/Page1 =========== "Room Options" ==========
    #And open room options form
    #And I fill room options with "${adultCount}" adults
    #And I confirm room options
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
      | Title         | FirstName         | LastName         | Country         | Nationality         | MobileCountry         | PhoneNumber         | Email         | Title   |
      | ${guestTitle} | ${guestFirstName} | ${guestLastName} | ${guestCountry} | ${guestNationality} | ${guestMobileCountry} | ${guestPhoneNumber} | ${guestEmail} |${guestTitleAndroid}|
    And Step/Page1 =========== "Payment" ==========
    And I activate the toggle to guarantee my booking
    And I fill card informations
      | cardType    | cardCVC    | cardNumber    | cardHolderName    | cardExpiration    | cardExpirationMonth    | cardExpirationYear    |
      | ${cardType} | ${cardCVC} | ${cardNumber} | ${cardHolderName} | ${cardExpiration} | ${cardExpirationMonth} | ${cardExpirationYear} |
    Then I verify that reservation is taken
    And I verify that status confirmed description text is displayed
    And I verify that checked icon is displayed
    And I verify that booking number is displayed
    And I verify that dateIn is displayed
    And I verify that dateOut is displayed
    And I verify that home button is displayed
    And I verify that cgv text is displayed
    And I verify that cgv Annulation text is displayed