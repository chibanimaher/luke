#@Android @Ios @Account
Feature:  [Home Page][DAPP-21694] Prepare your stay: Logos Brands
  Description : verify displaying next reservation at home page,
  pre-requis: connexion with account have next reservation or create a new reservationn and verify if it will display in the page home
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@SMOKE_TEST
  #@Sanity
  #@DAPP-17221
  @NR_TEST

  
  
  Given set data path "./data/booking/guestuser/LibelleCurrency.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Authent" ==========
    When I display Login Page
    And I do login with account information
      | Email        | Password        |
      | ${userEmail} | ${userPassword} |
    And Step/Page1 =========== "Search" ==========
    And I navigate to home page
    And I verify the display of the next reservation in the home page