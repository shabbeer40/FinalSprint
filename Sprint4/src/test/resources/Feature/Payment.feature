Feature: Payment option Test

Scenario: Payment Action
Given User on the Home page
When User clicks Cart button
And User clicks on Pay button
Then Payment Page must be visible
When User clicks on the Wallets
Then User should be able to pay using one of the Wallets
When User clicks on the Food Card
Then User should be able to pay using Card
When User clicks on the Credit or Debit Cards
Then User Should be able to pay using Credit or Debit Cards after entering the card details
When User clicks on the Net Banking
Then User selects the bank by which user want to pay amount
When User clicks on the more
Then User clicks on the Cash On Delivery Option and will place the order