#@Android @Ios @Login
Feature: [Account][Mon Compte][DAPP-11358] Wallet-Add a card
  Description : the client would add a new bank card.
  
        
  As a client 
  When I add a new bank card
  Then the new Credit or debit cards is added

  Background: User is Logged
    And I go back to Login Page from Home Page
    And I logout
    And I go back to the home page

  #@Sanity 
  #@DAPP-11358
  #@TEST_RETRY
  @NR_TEST 

  
  
  
  Scenario: [Account][Mon Compte][DAPP-11358] Wallet-Add a card
    Given set data path "./data/account/newmember/AccountWalletAddNewBankCard.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I display Login Page from Home Page
    And I do login with account information
      | Email        | Password       |
      | ${userEmail} | ${userPassword} |
    And I navigate to login page
    And I select the Credit or debit cards menu
    And I click on Add a bank card button to display Wallet
    And I add a new card informations 
      | cardType    | cardCVC    | cardNumber    | cardHolderName    | cardExpiration    | cardExpirationMonth    | cardExpirationYear    |
      | ${cardType} | ${cardCVC} | ${cardNumber} | ${cardHolderName} | ${cardExpiration} | ${cardExpirationMonth} | ${cardExpirationYear} |
    Then the Credit or debit cards is added
