#@Android @Ios @Account
Feature: [Home Page][DAPP-17237] Expiration date_Gold user
  
  As a client
  When I want to check the expiry date card 
  Then Expiry date is displayed at the bottom of the card

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  
  
 #@SMOKE_TEST
 #@Sanity
 #@DAPP-17237
 @NR_TEST

  
  Scenario: [Home Page][DAPP-21743] Prepare your stay:Logos Brands
    Given set data path "./data/booking/guestuser/LogosBrands.json"
    #And I click in the button accept when opening app
    And I verify that we are in homepage
    And Step/Page1 =========== "Login" ==========
    And I navigate to login page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
   Then I verify next booking
   And I check This reservation
   And I verify Logos Hotel
   And I verify DaysIn and DaysOut
   And I verify DateIn and DateOut
   And I verify presence of button "amend and cancel"
   
   
   
   Feature: [Home Page][DAPP-17229]Reset le moteur par d�faut apres un logout
  Description :
        
  As a client 
  When I want to verify the reset of the search after a logout 
  Then Expiration date of the card user is verified  
	Background: User is Logged
		And  I go back to Login Page from Home Page
		And  I logout
		And  I go back to the home page
	Scenario: Home Page][DAPP17229]Reset le moteur par d�faut apres un logout
		Given  set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
		And  I verify that we are in homepage
		And  Step/Page1 =========== "Login" ==========
		And  I navigate to login page
		And  I do login with account information
		And  I go back to the home page after authentification
		And  Step/Page1 =========== "Search" ==========
		And  I fill destination with
		And  I fill room dates
		And  Step/Page1 =========== "Room Options" ==========
		And  open room options form
		And  I fill room options with "${adultCount}" adults
		And  I fill room options with "${childrenCount}" childrens
		And  I confirm room options
		And  I do search
		And  Step/Page1 =========== "Hotel list" ==========
		And  Step/Page1 =========== "Logout" ==========
		And  I go back to Login Page from Home Page
		And  I logout