#@Android @Ios @Booking
Feature: [Hotel List][DAPP-14187] Intégration Encart Prix_ Libellé Accor Priviliged Partner
  Description : A generic booking with Login in from the join screen
      
  As a client 
  When I want to test the correct display of the price label on the LH
  Then displaying of the price label on the LH is taken
    
  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page 
  
  
  
  
  #@DAPP-14187
  #@Sanity 
  #@RETRY_TEST
  @NR_TEST

  
  
 
  Scenario: [Hotel List][DAPP-14187] Label Intégration Encart Prix_ Libellé Accor Priviliged Partner
    Given set data path "./data/hotellist/EncartPrixAccorPriviliged.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Authent" ==========
    When I display Login Page
    And I do login with account information
      | Email    | Password    |
      | ${email} | ${password} |
    And Step/Page1 =========== "Search" ==========
    And I go back to the home page 
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And Step/Page1 =========== "Room Options" ==========
    #And open room options form
    #And I fill room options with "${adultCount}" adults
    #And I confirm room options
    And I do search 
    And Step/Page1 =========== "Hotel list" ==========
    Then I verify that status Accor Priviliged Partner is displayed 