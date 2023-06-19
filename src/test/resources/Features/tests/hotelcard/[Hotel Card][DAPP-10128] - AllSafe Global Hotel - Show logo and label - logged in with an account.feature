#@Android @Ios @Booking
Feature: [Hotel Card][DAPP-10128] - AllSafe Global Hotel - Show logo and label - logged in with an account
  Description : a gineric logged in with an account and displaying of AllSafe Global Hotel label
  
  As a client
  When I want to logged in with with an account and select the hotel 
  Then AllSafe Global Hotel label is displayed 

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  
  

  #@Sanity 
  #@DAPP-10128
  #@RETRY_TEST
  #@DAPP-10128
  @NR_TEST
  

 
  
  Scenario: [Hotel Card][DAPP-10128] - AllSafe Global Hotel - Show logo and label - logged in with an account
    Given set data path "./data/hotelcard/HotelCardAllSafeGlobalHotel.json"
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
    #And I fill room dates
    #| dateIn    | DateOut    | DateFormat    |
    #| ${dateIn} | ${dateOut} | ${dateFormat} |
    And I do search
    And Step/Page1 =========== "Hotel list" ==========
    And I find the hotel with
      | HotelName    |HotelNameiOS |
      | ${hotelName} |${hotelNameIos} |
   # Then the picto AllSafe Global is displayed 
   # And the hotel_safe_label is displayed 
   # And I click on  AllSafe Global botton 
    And I verify  AllSafe Global text
 
