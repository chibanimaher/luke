#@Android @Ios @Booking
Feature: [Hotel Card][DAPP-13368] Affichage de la map
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
  #@DAPP-13368
  #@RETRY_TEST
  @NR_TEST

  



  
  
  Scenario: [Hotel Card][DAPP-13368] Affichage de la map
    Given set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And I scroll to the local map
    #And I verify the presence of the logo of the hotel on the google map page
    And I display the local map page view
    Then I verify the presence of the close button
    And I verify the presence of the google map page
    And I verify the presence of the adress of the hotel
    