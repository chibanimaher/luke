#@Android @Ios @Account
Feature: [Home Page][DAPP-17221] [Autos-Tests] Search Engine: Champ Destination aucun résulat
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
  #@DAPP-17221
  @NR_TEST
  Scenario: [Home Page][DAPP-17221]  [Autos-Tests] [Home Page][DAPP-17221]Search Engine: Destination without result.feature
    Given set data path "./data/booking/guestuser/SearchDestination.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I fill the destination with
      | destination    |
      | ${destination} | 
    And I verify the diplay of the word search under the destination
    
