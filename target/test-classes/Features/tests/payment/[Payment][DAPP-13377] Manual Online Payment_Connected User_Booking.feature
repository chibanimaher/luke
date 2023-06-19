#@Android @Ios @Booking
Feature: [Payment][DAPP-13377] Manual Online Payment_Connected User_Booking
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
  #@DAPP-13377
  #@RETRY_TEST
  @NR_TEST

  Scenario: [Payment][DAPP-13377] Manual Online Payment_Connected User_Booking
    Given set data path "./data/payment/PaymentWithUserConnected.json"
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
    And I select the hotel with
      | HotelName    |
      | ${hotelName} |
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rooms
    And I select the room with
      | RoomName     |
      | ${room.name} |
    And I confirm selected rate
    And Step/Page1 =========== "Confirmation" ==========
    And I submit summary information
    Then I verify basket display with information
      | basketPrice   | basketLabel    |
      | ${room.price} | ${basketLabel} |
    When I select add rewards points
    Then I verify basket updated with information
      | InitialPrice  | rewardsDiscount    |
      | ${room.price} | ${rewardsDiscount} |
