@hotelLogin
Feature:US 0005 hotel login

  Background:
  Given user goes to CRYSTALKEY HOTELS page
    And user clicks Log in button

Scenario Outline: RoomCreation

And user enters a valid "<username>" in the username button
And user enters valid "<password>" on password button
And user clicks login button
And user clicks on Hotel management dropDown
And user selects Hotel Rooms
And user clicks the ADD HOTELROOM button on the top right
And user selects Hotel from ID HOTEL Dropdown
And user clicks the Code button and enters a valid number
And user clicks on Name button and enters Room name
And user clicks the Address button and enters a valid address
And User Description Section (A short description of the hotel)
And user Set Price Option using drag and drop boxes(200,300,400,500,600,700)
And user specifies the room type from the Room Type dropDown
And kullanici Max yetiskin butonundan yetiskin sayisi girer
And user Max enters the number of children from the number of children button
And user clicks the Confirmation Box
And user clicks the Save button
Then user sees Hotel successfully added message

Examples:
  |username|password |
  |manager |Manager1!|



















