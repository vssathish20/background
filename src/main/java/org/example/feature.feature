@phone
Feature:buying phonr
  Background:
    Given looking for mobile shop
    Given i need enough money
@iphone
  Scenario:i am going to buy iphone
    Given iphone is costly
    When red colour looks elegant so i have to buy red color iphone
    Then show me latest model
    And i dont need warantty


  @windowsphone
  Scenario:i am going to buy windowsphone
    Given windows phone is  moderate price
    When red colour looks elegant so i have to buy red color
    Then show me new model
    And i dont need warantty
