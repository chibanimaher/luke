#@Android @Ios @Booking
Feature: [Hotel Card][DAPP-13369] Affichage du descriptif de l’hôtel
  Description : a generic booking with adults
        
  As a Guest 
  When I want to login with adults
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  

  #@Sanity
  #@SMOKE_TEST 
  #@DAPP-13369 
  #@RETRY_TEST
  @NR_TEST 


  

  Scenario: [Hotel Card][DAPP-13369] Affichage du descriptif de l’hôtel
    Given set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    Then I verify the presence of the name of the hotel
    And I verify the presence of the logo of the hotel
    And I verify the presence of the description of the hotel
    