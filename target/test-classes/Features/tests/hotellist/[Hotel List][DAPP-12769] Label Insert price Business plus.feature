#@Android @Ios @Booking
Feature: [Hotel List][DAPP-12769] Label Insert price Business plus
  Description : A generic booking with Login in from the join screen
      
  As a client 
  When I want to test the correct display of the price label on the LH
  Then displaying of the price label on the LH is taken
    
  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page 
  
  
  
  #@SMOKE_TEST
  #@Sanity 
  #@DAPP-12769
  @NR_TEST
  
  Scenario: [Hotel List][DAPP-12769] Label Insert price Business plus
    Given set data path "./data/hotellist/HotelListInsertPrice_labelBusinessPlus.json"
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
     And Step/Page1 =========== "Search" ==========
    And I do search 
    And Step/Page1 =========== "Hotel list" ========== 
    Then I verify that status Business Plus is displayed  


 