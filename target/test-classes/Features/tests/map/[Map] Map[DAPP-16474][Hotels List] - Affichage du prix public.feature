#@Android @Ios @Account
Feature: [Home Page][DAPP-16474] [Autos-Tests] Map Affichage du prix public
  Description : Header Connecte Connected user
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@SMOKE_TEST
  #@Sanity
  @NR_TEST


  
  
  Scenario: [Home Page][DAPP-DAPP-16474]  [Autos-Tests] [Home Page][DAPP-DAPP-16474]Map Affichage du prix publict.feature
    Given set data path "./data/hotellist/PinHotelMap.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I do search
    And I click on the hotel map list button
    And I click on the hotel pin 
    Then I verify that public rate is displayed on the hotel card
    
    
    
    
      
    