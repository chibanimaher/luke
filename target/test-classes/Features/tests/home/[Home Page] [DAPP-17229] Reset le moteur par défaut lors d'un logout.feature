#@Android @Ios @Account
Feature: [Home Page][DAPP-17229]Reset le moteur par défaut apres un logout
  Description :
        
  As a client 
  When I want to verify the reset of the search after a logout 
  Then Expiration date of the card user is verified  

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@SMOKE_TEST
  #@Sanity
  #@DAPP-17229
  @NR_TEST
  
 
  Scenario: [Home Page][DAPP-17229]Reset le moteur par défaut apres un logout
    Given set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
    And I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And I go back to the home page after authentification 
    And Step/Page1 =========== "Search" ==========
    When I fill destination with
      | destination    |destinationIos     |
      | ${destination} | ${destinationiOS} |
    And Step/Page1 =========== "Room Options" ==========
    And open room options form
    And I fill room options with "${adultCount}" adults
    And I confirm room options
    And I do search
		And  I go back to the previous page
		And  Step/Page1 =========== "Logout" ==========
		And  I go back to Login Page from Home Page
		And  I logout
		Then  I verify that logout is success
		And  Step/Page1 =========== "Search" ==========
		And  I go back to the home page
    