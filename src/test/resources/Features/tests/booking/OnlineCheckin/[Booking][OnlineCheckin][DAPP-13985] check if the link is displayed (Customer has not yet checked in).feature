#@Android @Ios @Account
Feature: [Booking][OnlineCheckin][DAPP-13985]: check if the link is displayed (Customer has not yet checked in)
  Description : A generic booking with Login in from the join screen
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page


  #@SMOKE_TEST
  #@Sanity
  #@DAPP-13985
  #@TEST_RETRY
  #@RETRY_TEST
  @NR_TEST 
  

  
  
  
  
  
  Scenario: [Booking][OnlineCheckin][DAPP-13985]: check if the link is displayed (Customer has not yet checked in)
    Given set data path "./data/booking/userlogged/OnlineCheckinStay.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And Step/Page1 =========== "Search" ==========
    And I navigate to home page
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I fill room dates
     | dateIn    | DateOut    | DateFormat    |
     | ${dateIn} | ${dateOut} | ${dateFormat} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${roomCount}" rooms
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
    And I select the first hotel
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And I submit summary information presence element
      | emailAdress    | phoneNumber    |
      | ${emailAdress} | ${phoneNumber} |      
    And Step/Page1 =========== "Add Card CVC" ==========
    And I add card CVC
      |  CardCVC    |
      |  ${cardCVC} |
    And Step/Page1 =========== "Payment" ==========
    And I accept general conditions of payment
    Then I verify that reservation is taken
    And I click on the button back to home page
    And I click on tab future and  I click on see more
    And I Check the reservation details Online   