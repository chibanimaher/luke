#Android @Ios @Booking

Feature: [Payment][DAPP-13379]Manual_Online_Payment_Basket_Verif

  Description : a gineric booking with childrens
        
  As a client 
  When I want to login with childrens
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@DAPP-13379
  #@RETRY_TEST
  @NR_TEST

  Scenario: [Payment][DAPP-13379]Manual_Online_Payment_Basket_Verif

    Given set data path "./data/booking/guestuser/TestPayment.json"
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
    #And I fill room dates
    # | dateIn    | DateOut    | DateFormat    |
    # | ${dateIn} | ${dateOut} | ${dateFormat} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${roomCount}" rooms
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And I submit summary informations
    #And I submit summary information presence element
    #  | emailAdress    | phoneNumber    |
    #  | ${emailAdress} | ${phoneNumber} | 
    Then I verify basket information
      | hotelName    | dateStart    | dateEnd    | nightNumber    | breakfastIncluded    | adultNumber    | childrenNumber    | priceHotel    | variousTaxe    | roomNumber    | packageOffer    |
      | ${hotelName} | ${dateStart} | ${dateEnd} | ${nightNumber} | ${breakfastIncluded} | ${adultNumber} | ${childrenNumber} | ${priceHotel} | ${variousTaxe} | ${roomNumber} | ${packageOffer} |
