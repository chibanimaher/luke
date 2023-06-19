#@Android @Ios @Account
Feature: [Account][BAM][DAPP-2880]Authentification from the Become a member screen
  Description : A generic booking with Login in from the join screen
        
  As a client 
  When I want to login in from the join screen
  Then my reservation is taken

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  

  #@Sanity 
  #@DAPP-2880 
  @SMOKE_TEST


  
  Scenario: [Account][BAM][DAPP-2880]Authentification from the Become a member screen
    Given set data path "./data/booking/guestuser/BookingWithGuestUserWithChildrens.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
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
    And Step/Page1 =========== "Room Rate" ==========
    And I display all rates
    And I select the first rate
    And I confirm selected rate
    And I verify that Enroll bloc is displayed 
    And Step/Page1 =========== "Confirmation" ==========
    And I display Login Page for authentification  
    And I continue with login connexion
      | Email        | pwd            |  
      | ${userEmail} | ${userPassword}|
    Then I confirm member with following informations
    
    