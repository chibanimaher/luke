#@Android @Ios @Account
Feature: [Account][DAPP-3090]Authentication: Member account creation
  Description : the client should create his account.
  
        
  As a client 
  When I create my account
  Then my account should be created

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page  
  
  
  #@Sanity
  #@DAPP-3090
  #@TEST_RETRY
  #@SMOKE_TEST
 

  Scenario: [Account][DAPP-3090]Authentication: Member account creation
    Given set data path "./data/account/newmember/AccountCreationWithClassicMember.json"
   # Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I display Login Page from Home Page
    And I display the account creation page 
    And Step/Page1 =========== "Adding information" ==========
    And I fill in all fields of account creation 
     |  Email           | pwd             | Title         | FirstName         | LastName         | Country         | Nationality         | MobileCountry         | PhoneNumber         | 
     |   ${userEmail}   | ${userPassword} | ${guestTitle} | ${guestFirstName} | ${guestLastName} | ${guestCountry} | ${guestNationality} | ${guestMobileCountry} | ${guestPhoneNumber} |
    And Step/Page1 =========== "Check success creation" ==========
    Then I verify that account is created with success
    
