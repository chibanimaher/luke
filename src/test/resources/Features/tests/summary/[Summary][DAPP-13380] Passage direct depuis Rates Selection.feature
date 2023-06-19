#@Android @Ios @Booking
Feature: [Summary][DAPP-13380] Passage direct depuis Rates Selection
  Description : a gineric booking with payment control
  
  As a client
  When I want to booking with points- payment at the hotel
  Then my booking can book with points

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  
  
  #@Sanity
  #@SMOKE_TEST 
  #@DAPP-13380 
  #@RETRY_TEST
  @NR_TEST
  

  
  Scenario: [Summary][DAPP-13380] Passage direct depuis Rates Selection
    Given set data path "./data/payment/PaymentConnectedUserBookingRejectedInvalidInput.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email    | Password    |
      | ${email} | ${password} |
    And Step/Page1 =========== "Search" ==========
    #And I navigate to home page
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I do search
     And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And Step/Page1 =========== "Confirmation" ==========
    Then I verify that the Summary page is displayed with a Summary title in the header