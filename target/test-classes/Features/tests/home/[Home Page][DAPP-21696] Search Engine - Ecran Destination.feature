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
 

  
  Scenario: [Home Page][DAPP-21696] Search Engine - Ecran Destination
    Given I verify that we are in homepage
    And I click in champ destination
    And I send just one caracter
    Then Verify displaying "search" and "icon X" and "the caracter"
    And I send just three caracter
    And  I Verify list of proposition hotel
    And I Click in destination and do search
    Then I Back up to Home Page
    Then I verify the same destination choosed before the search
    And I click another in the destination
    Then I verify "Arrond me" is displayed and the champ "where you want to go" is empty
    Then I Back up to Home Page