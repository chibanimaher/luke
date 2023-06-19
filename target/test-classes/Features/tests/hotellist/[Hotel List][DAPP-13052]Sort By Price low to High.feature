#@Android  
Feature: [Hotel List][DAPP-13052]Sort By Price low to High
  Description : Sort By Price High to low
     
  As a client 
  When I select one of the sortings and I "Confirm"
  Then I should see the hotel list sorted according to the selected sorting in order to categorize the hotel list
  
  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  

  #@Sanity 
  #@DAPP-13052 
  #@NR_TEST
  #@SMOKE_TEST
 
  Scenario: [Hotel List][DAPP-13052]Sort By Price low to High
    Given set data path "./data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |
      | ${destination} | 
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I display Sort Page 
    And I select the price sort from low to high
    And I confirm my sorting selection 
   Then I verify that Hotels are listed from least expensive to most expensive
   
    
   