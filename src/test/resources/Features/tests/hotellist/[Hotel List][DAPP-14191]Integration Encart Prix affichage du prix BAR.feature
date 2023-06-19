#@Android @Ios @Booking
Feature: [Hotel List][DAPP-14191]Integration Encart Prix affichage du prix BAR
  Description : A generic booking with Login in from the join screen
        as a QA, 
  As a client 
  When I want to test the correct display of the price label on the LH
  Then displaying of the price label on the LH is taken
​
  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  

  #@Sanity
  #@DAPP-14191
  #@RETRY_TEST
  @NR_TEST



  Scenario: [Hotel List][DAPP-14191]Integration Encart Prix affichage du prix BAR
    Given set data path "./data/hotellist/EncartPrixBar.json"
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
    #And I fill room dates
    # | dateIn    | DateOut    | DateFormat    |
    # | ${dateIn} | ${dateOut} | ${dateFormat} |à
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And I display all rates
    Then I verify the display of price bar in hotel list