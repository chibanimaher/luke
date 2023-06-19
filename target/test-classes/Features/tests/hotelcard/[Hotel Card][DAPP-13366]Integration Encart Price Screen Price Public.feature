#@Android @Ios @Booking
Feature: [Hotel List][DAPP-13366]Intégration Encart Price Screen Price Public
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
  #@DAPP-13366
  #@RETRY_TEST
  @NR_TEST


  

    Scenario: [Hotel List][DAPP-13366]Intégration Encart Price Screen Price Public
   Given set data path "./data/roomselection/ScreenPriceMember.json"
   Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And Step/Page1 =========== "Search" ==========
   #And I navigate to home page
   #And I verify presence of reweards points in home page
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${roomCount}" rooms
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I display all rates
    And I select the first rate
    And I confirm selected rate