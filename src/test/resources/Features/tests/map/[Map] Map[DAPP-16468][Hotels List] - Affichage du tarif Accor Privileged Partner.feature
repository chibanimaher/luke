#@Android @Ios @Account
Feature: [Home Page][DAPP-16468] [Autos-Tests] Map Affichage du tarif Accor Privileged Partner
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
  @tgb


  
  
  Scenario: [Home Page][DAPP-16468]  [Autos-Tests] [Home Page][DAPP-DAPP-16468]Map Affichage du tarif Accor Privileged Partner.feature
   Given set data path "./data/rateselection/RateSelectionLabelInserUserPriceAccorPrivilegedPartners.json"

    Given I verify that we are in homepage
    And Step/Page1 =========== "Authent" ==========
    When I display Login Page
    And I do login with account information
      | Email    | Password    |
      | ${email} | ${password} |
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} | 
    And I do search
    And I click on the hotel map list button
    And I click on the hotel pin privileged partner
    Then I verify that status Accor Privileged Partners is displayed on map card
    
    
    
    
      
    