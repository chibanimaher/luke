#@Android @Ios @homepage
Feature: [[Home Page][DAPP-17222] Search Engine: Validation de la recherche
  Description : Search Engine: Validate a search
        
  As a client 
  When I leave my field empty
  Then I want to display a pop up alert 

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@SMOKE_TEST
  #@Sanity
  #@DAPP-17222
  @NR_TEST
 

  
  Scenario: [Home Page][DAPP-21736] Search Engine - Header du champ Destination
    Given I verify that we are in homepage
    And I Click in champ destination
    And I Verify close "Button" and the cham of text
    And I Send  destination in the champ destination
    And I Verify list of hotel displayed 
    Then I delete this destination
    And I verify list of hotel not displayed 
    And I verify champ destination is empty
