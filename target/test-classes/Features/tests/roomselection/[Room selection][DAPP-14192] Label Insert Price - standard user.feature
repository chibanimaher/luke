#@Android @Ios @Booking
Feature: [Room selection][DAPP-14192] Label Insert Price - standard user
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
  #@DAPP-14192
  @NR_TEST

  
  
  Scenario: [Room selection][DAPP-14192] Label Insert Price - standard user
     Given set data path "./data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Select Destination" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I fill room dates
      | dateIn    | DateOut    | DateFormat    |
      | ${dateIn} | ${dateOut} | ${dateFormat} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And I display all rates    
    Then I verify that the offers are for a standard user
    