#@Android @Booking
Feature: [Hotel Card][DAPP-13367] Affichage de la composition de la chambre
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
  #@DAPP-13367
  @NR_TEST 
  
  Scenario: [Hotel Card][DAPP-13367] Affichage de la composition de la chambre
    Given set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    Then I verify the display of the composition of the room of the hotel
    