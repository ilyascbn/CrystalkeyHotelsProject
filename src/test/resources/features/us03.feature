@us03
@Regression
Feature: US03 Add Room

  Background:
    Given Kullanıcı CRYSTALKEY HOTELS sayfasına gider
    And Kullanıcı sağ üstteki Log in butonuna tıklar
    And User enter a valid username
    And User enter a valid password


  @US03 @TC001
  Scenario: Add a valid hotel
    And User click the Login button
    And User click the Hotel management button
    And User click the Hotel List button
    And User click the ADD HOTEL button in the top right corner
    And User enter a valid code
    And User enter a valid name
    And User enter a valid address
    And User enter a valid phone number
    And User enter a valid Gmail address
    And User select a valid ID group
    And User click the Save button
    Then User see a message that the hotel was added successfully

  @US03 @TC002
  Scenario: Add a hotel with an invalid code
    And User click the Login button
    And User click the Hotel management button
    And User click the Hotel List button
    And User click the ADD HOTEL button in the top right corner
    And User leave the Code textbox empty
    And User enter a valid name
    And User enter a valid address
    And User enter a valid phone number
    And User enter a valid Gmail address
    And User select a valid ID group
    And User click the Save button
    Then User see an error message


  @US03 @TC003
  Scenario: Add a hotel with an empty name
    And User click the Login button
    And User click the Hotel management button
    And User click the Hotel List button
    And User click the ADD HOTEL button in the top right corner
    And User enter a valid code
    And User leave the Name textbox empty
    And User enter a valid address
    And User enter a valid phone number
    And User enter a valid Gmail address
    And User select a valid ID group
    And User click the Save button
    Then User see an error message

  @US03 @TC004
  Scenario: Add a hotel with an empty email address
    And User click the Login button
    And User click the Hotel management button
    And User click the Hotel List button
    And User click the ADD HOTEL button in the top right corner
    And User enter a valid code
    And User enter a valid name
    And User enter a valid address
    And User enter a valid phone number
    And User leave the Email textbox empty
    And User select a valid ID group
    And User click the Save button
    Then User see an error message


  @US03 @TC005
  Scenario: Add a hotel with an empty address
    And User click the Login button
    And User click the Hotel management button
    And User click the Hotel List button
    And User click the ADD HOTEL button in the top right corner
    And User enter a valid code
    And User enter a valid name
    And User leave the Address textbox empty
    And User enter a valid phone number
    And User enter a valid Gmail address
    And User select a valid ID group
    And User click the Save button
    Then User see an error message below the Address textbox


  @US03 @TC006
  Scenario: Add a hotel with an empty ID group
    And User click the Login button
    And User click the Hotel management button
    And User click the Hotel List button
    And User click the ADD HOTEL button in the top right corner
    And User enter a valid code
    And User enter a valid name
    And User enter a valid address
    And User enter a valid phone number
    And User enter a valid Gmail address
    And User leave the ID Group dropdown empty
    And User click the Save button
    Then User see an error message below the ID Group dropdown


  @US03 @TC007
  Scenario: : Add a hotel with an invalid phone number
    And User click the Login button
    And User click the Hotel management button
    And User click the Hotel List button
    And User click the ADD HOTEL button in the top right corner
    And User enter a valid code
    And User enter a valid name
    And User enter a valid address
    And User enter a letter in the Phone textbox
    And User enter a valid Gmail address
    And User select a valid ID group
    And User click the Save button
    Then User see an error message

