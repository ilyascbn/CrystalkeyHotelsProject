package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.Login_Page;
import pages.RoomCreation_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class RoomCreation_StepDefinitons {

    Login_Page login_page = new Login_Page();
    RoomCreation_Pages roomCreationPages = new RoomCreation_Pages();
    Actions actions = new  Actions(Driver.getDriver());
    @Given("user goes to CRYSTALKEY HOTELS page")
    public void user_goes_to_crystalkey_hotels_page() {
        Driver.getDriver().get(ConfigReader.getProperty("Weburl"));

        try{
            Thread.sleep(3000);
            login_page.advancedLink.click();
            Thread.sleep(2000);
            actions.moveByOffset(0,200).perform();
            login_page.proceedLink.click();
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Advanced Link and Proceed Link not requested");
        }
    }
    @Given("user clicks Log in button")
    public void user_clicks_log_in_button() {
        roomCreationPages.loginButonu.click();

    }
    @Given("user enters a valid username in the username button")
    public void user_enters_a_valid_username_in_the_username_button() {
        roomCreationPages.username.click();

    }
    @Given("user enters valid password on password button")
    public void user_enters_valid_password_on_password_button() {
        roomCreationPages.pasaport.click();

    }
    @Given("user clicks login button")
    public void user_clicks_login_button() {
        roomCreationPages.login_Buton2.click();

    }
    @Given("user clicks on Hotel management dropDown")
    public void user_clicks_on_hotel_management_drop_down() {
     roomCreationPages.hotelManagement.click();


    }
    @Given("user selects Hotel Rooms")
    public void user_selects_hotel_rooms() {
     roomCreationPages.hotelRooms.click();

    }
    @Given("user clicks the ADD HOTELROOM button on the top right")
    public void user_clicks_the_add_hotelroom_button_on_the_top_right() {
        roomCreationPages.ADD_HOTELROOM.click();

    }
    @Given("user selects Hotel from ID HOTEL Dropdown")
    public void user_selects_hotel_from_id_hotel_dropdown() {
        roomCreationPages.iDHotel.click();

    }
    @Given("user clicks the Code button and enters a valid number")
    public void user_clicks_the_code_button_and_enters_a_valid_number() {
       roomCreationPages.code.click();

    }
    @Given("user clicks on Name button and enters Room name")
    public void user_clicks_on_name_button_and_enters_room_name() {
        roomCreationPages.name.click();

    }
    @Given("user clicks the Address button and enters a valid address")
    public void user_clicks_the_address_button_and_enters_a_valid_address() {
        roomCreationPages.location.click();

    }
    @Given("User Description Section \\(A short description of the hotel)")
    public void user_description_section_a_short_description_of_the_hotel() {
        roomCreationPages.description.click();

    }
    @Given("user Set Price Option using drag and drop boxes\\({double})")
    public void user_set_price_option_using_drag_and_drop_boxes(Double double1) {
        roomCreationPages.price.click();

    }
    @Given("user specifies the room type from the Room Type dropDown")
    public void user_specifies_the_room_type_from_the_room_type_drop_down() {
        roomCreationPages.roomType.click();

    }
    @Given("kullanici Max yetiskin butonundan yetiskin sayisi girer")
    public void kullanici_max_yetiskin_butonundan_yetiskin_sayisi_girer() {
        roomCreationPages.maxAdultCount.click();

    }
    @Given("user Max enters the number of children from the number of children button")
    public void user_max_enters_the_number_of_children_from_the_number_of_children_button() {
        roomCreationPages.maxChildrenCount.click();
    }
    @Given("user clicks the Confirmation Box")
    public void user_clicks_the_confirmation_box() {
        roomCreationPages.approved.click();

    }
    @Given("user clicks the Save button")
    public void user_clicks_the_save_button() {
        roomCreationPages.SAVE.click();

    }
    @Then("user sees Hotel successfully added message")
    public void user_sees_hotel_successfully_added_message() {
        roomCreationPages.OK.click();

    }
}
