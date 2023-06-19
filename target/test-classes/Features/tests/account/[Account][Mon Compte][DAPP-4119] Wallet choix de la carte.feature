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

  
  
  
  Scenario: [Account][Mon Compte][DAPP-4119] Wallet choix de la carte
    Given set data path "./data/account/newmember/AccountWalletAddNewBankCard.json"
    Given I verify that we are in homepage
    And Step/Page1 =========== "Search" ==========
    When I display Login Page from Home Page
    And I do login with account information Se connecter avec un LCAH valide
      | Email        | Password       |
      | ${userEmail} | ${userPassword} |
    And I navigate to moyen of payment
    And I select the Credit or debit cards menu
    And I click on Add a bank card button to display Wallet
    And Verify champ "Choose your credit card" is displayed
    Then Tap in the champ  "Choose your credit card" and verify the page opened
    Then Click in the  bouton "Add a card" without choose any carte
    Then Verify message error “Please pick a card type”
    Then back and choose some carte 
    Then verify carte is selected
