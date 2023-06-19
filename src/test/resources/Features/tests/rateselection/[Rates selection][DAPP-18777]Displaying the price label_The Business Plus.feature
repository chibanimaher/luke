#@Android @Ios @Booking
Feature: [Rates selection][DAPP-18777]Displaying the price label_The Business Plus

 Description : Displaying the Business Plus status

        as a QA, 
  As a client 
  When I want to test the correct display of the price label on rates
  Then displaying of the price label on the rates
  
  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page 
  
  
  
  #@Sanity 
  #@DAPP-18777 
  @NR_TEST


  Scenario: [Rates selection][DAPP-18777]Displaying the price label_The Business Plus

 
     Given set data path "./data/rateselection/RateSelectionLabelInserUserPriceBusinessPlus.json"
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
    #And I fill room dates
    # | dateIn    | DateOut    | DateFormat    |
    # | ${dateIn} | ${dateOut} | ${dateFormat} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And I display all rates
    And I select the first rate    
    Then I verify that status Business Plus is displayed
