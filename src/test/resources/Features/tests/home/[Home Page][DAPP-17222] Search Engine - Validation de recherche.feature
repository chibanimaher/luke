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
 

  
  Scenario: [Home Page][DAPP-17222] Search Engine: Validation de la recherche
    Given I verify that we are in homepage
    And I do search
    And I verify that the pop up search unvailable 