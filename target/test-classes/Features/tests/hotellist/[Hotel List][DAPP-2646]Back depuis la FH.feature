#@Android @Ios @Booking
Feature: [Hotel List][DAPP-2646]Back depuis la FH
  Description : go back to the hotel list from hotel details
        as a QA, 
  As a client 
  When I want to test the back to the LH
  Then displaying of the price label on the LH is taken
  
  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  

  #@Sanity 
  #@DAPP-2646
  #@TEST_RETRY
  @NR_TEST
  
  
  
  
  
   
  
  Scenario: [Hotel List][DAPP-2646]Back depuis la FH
    Given set data path "./data/hotellist/BackHotelMap.json"
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
    And I select the button carte hotel
    And I click in the button back to hotel list
    
    
    
   
    
   