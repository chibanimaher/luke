#@Android @Ios @Booking
Feature: [Hotel List][DAPP-12762]Label Insert User-price Toggle STAY PLUS Activated
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
  #@DAPP-12762
  #@RETRY_TEST
  #@RETRY_TEST
  @NR_TEST
  

 
   

    Scenario: [Hotel List][DAPP-12762]Label Insert User-price Toggle STAY PLUS Activated
    Given set data path "./data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json"
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
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I activate StayPlus status 
    And I select the hotel with
      | HotelName    |
      | ${hotelName} |
    Then I verify that status STAY PLUS is displayed