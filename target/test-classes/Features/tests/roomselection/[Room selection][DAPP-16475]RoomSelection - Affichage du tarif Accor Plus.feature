#@Android @Ios @Booking
Feature: [Room selection][DAPP-16475] RoomSelection - Affichage du tarif Accor Plus
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
  #@DAPP-16475
  #@TEST_RETRY
  #@RETRY_TEST
  @NR_TEST

  
  
  
  Scenario: [Room selection][DAPP-16475] RoomSelection - Affichage du tarif Accor Plus
     Given set data path "./data/roomselection/RoomPricePublicAccorPlus.json"
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
    And I verify that the price public is not displayed below the rate accor plus
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rates
    And I verify that the price public is not displayed below the rate accor plus
    And I select the first rate
    And I confirm selected rate
    And I confirm user with following informations
      |  Nationality         |  MobileCountry        | PhoneNumber         | Email        |
      |  ${guestNationality} | ${guestMobileCountry} | ${guestPhoneNumber} | ${userEmail} |
    And Step/Page1 =========== "Add Card CVC" ==========
    And I add card CVC
      |  CardCVC    |
      |  ${cardCVC} |
    And Step/Page1 =========== "Payment" ==========
    And I accept general conditions of payment
    Then I verify that reservation is taken
    
   