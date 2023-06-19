#@Android @Ios @Booking
Feature: [Room selection][DAPP-9399][Multiroom]- iOS - Engine-Add children
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
 #@DAPP-9399 
 #@NR_TEST
 @SMOKE_TEST
  Scenario: [Room selection][DAPP-3999][Multiroom]- iOS - Engine-Add children
    Given set data path "./data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json"
    Given I verify that we are in homepage
    #And Step/Page1 =========== "Authent" ==========
    #When I display Login Page
    #And Step/Page1 =========== "Search" ==========
    #And I go back to the home page 
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options children with children
    And I verify the display of the message with maximum children count
    And I fill room options until have zero children
    And I verify the display of the number of children
   
 