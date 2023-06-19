#@Android @Ios @Booking
Feature: [Hotel Card][DAPP-13374]Intégration Encart Prix_ Libellé Accor Plus
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
  #@DAPP-13374
  #@RETRY_TEST
  @NR_TEST
 
  
 
 
 
  Scenario: [Hotel Card][DAPP-13374]Intégration Encart Prix_ Libellé Accor Plus
    Given set data path "./data/hotelcard/HotelCardIntegrationInsertPrice_labelAccorPlus.json"
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
    #And I activate StayPlus status
    And I find the hotel with
      | HotelName    |HotelNameiOS |
      | ${hotelName} |${hotelNameIos} |
    Then I verify that status Advantage Plus is displayed   
 