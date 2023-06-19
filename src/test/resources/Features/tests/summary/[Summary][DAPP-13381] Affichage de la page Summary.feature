#Android @Ios @Booking
Feature: [Summary][DAPP-13381] Affichage de la page Summary
  Description : a gineric booking with childrens
        
  As a client 
  When I want to login with childrens
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  
  
  #@Sanity
  #@SMOKE_TEST 
  #@DAPP-13381
  @NR_TEST
  
   
  Scenario: [Summary][DAPP-13381] Affichage de la page Summary
    Given set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
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
    And Step/Page1 =========== "Confirmation" ==========
    And I continue without connexion
    Then I verify that the Summary page is displayed with a Summary title in the header
    
    
    
 
