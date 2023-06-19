#@Android @Ios @Booking
Feature: [Payment][DAPP-13376]Manual Online Payment_connected user_Booking Rejected_ Invalid Input
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
  #@DAPP-13376 
  #@RETRY_TEST
  @NR_TEST


  
  Scenario: [Payment][DAPP-13376]Manual Online Payment_connected user_Booking Rejected_ Invalid Input
    Given set data path "./data/payment/PaymentConnectedUserBookingRejectedInvalidInput.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I click in the button login 
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
    And I submit summary information
    And I activate the toggle to guarantee my booking
    And I fill card informations
      | cardType    | cardCVC    | cardNumber    | cardHolderName    | cardExpiration    | cardExpirationMonth    | cardExpirationYear    |
      | ${cardType} | ${cardCVC} | ${cardNumber} | ${cardHolderName} | ${cardExpiration} | ${cardExpirationMonth} | ${cardExpirationYear} |
    Then I verify that status unable Confirm Booking Message is displayed
    And I verify that status description text is displayed
    And I verify that payment status text is displayed
    And I verify that home button is displayed
    And I verify that cgv text is displayed
    And I verify that cgv Annulation text is displayed