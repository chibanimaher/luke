#@Android @Ios @Booking
Feature: [Hotel List][DAPP-8388]Envoi d'un e-mail à un hôtel depuis la FH
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
  #@DAPP-8388
  #@NR_TEST
  @SMOKE_TEST

  
  
  
   
  
  Scenario: [Hotel List][DAPP-12760]Envoi d'un e-mail à un hôtel depuis la FH
    Given set data path "./data/hotellist/emailHotel.json"
    Given I verify that we are in homepage
    #And Step/Page1 =========== "Search" ==========
    #And I go back to the home page 
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I select the first hotel
    And I verify the button send email in the hotel information
   
    
   