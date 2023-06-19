#@Android @Ios @Booking
Feature: [Room selection][DAPP-16477] RoomSelection - Affichage du prix public (Guest)
  Description : A generic booking with Login in from the join screen
        as a QA, 
  As a client 
  When I want to test the correct display of the price label on the LH
  Then displaying of the price label on the LH is taken
    
  
  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page 
  
  
  
  #@Sanity 
  #@DAPP-16477
  #@TEST_RETRY
  #@RETRY_TEST
  @NR_TEST
  
  
  Scenario: [Room selection][DAPP-16477] RoomSelection - Affichage du prix public (Guest)
     Given set data path "./data/roomselection/PricePublicFigmaGuest.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Authent" ==========
    When I display Login Page
    And Step/Page1 =========== "Search" ==========
    And I go back to the home page 
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    #And I verify that the price public is displayed below the member rate and the price public not barred
    And I display all rates
    And I verify that the price public is displayed below the member rate and the price public not barred
   
   