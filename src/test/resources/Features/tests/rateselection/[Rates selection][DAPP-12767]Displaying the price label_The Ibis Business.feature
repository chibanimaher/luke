#@Android @Ios @Booking
Feature: [Rates selection][DAPP-12767]Displaying the price label_The Ibis Business
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
  #@DAPP-12767
  #@RETRY_TEST
  @NR_TEST


 

  
  Scenario: [Rates selection][DAPP-12767]Displaying the price label_The Ibis Business
     Given set data path "./data/rateselection/RateSelectionLabelInserUserPriceIbisBusiness.json"
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
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And I display all rates 
    And I select the first rate   
    Then I verify that status Ibis Business is displayed
