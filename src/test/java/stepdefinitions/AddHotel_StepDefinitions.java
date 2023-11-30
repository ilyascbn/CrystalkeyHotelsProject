package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AddRoom_Page;
import pages.Login_Page;
import utilities.Driver;
import org.junit.Assert;

public class AddHotel_StepDefinitions {
    AddRoom_Page addRoomPage = new AddRoom_Page();
    Login_Page login_page = new Login_Page();
    Faker faker = new Faker();

    Actions actions = new Actions(Driver.getDriver());
    @Given("User enter a valid username")
    public void user_enter_a_valid_username() {
        login_page.username.sendKeys("manager");
    }
    @Given("User enter a valid password")
    public void user_enter_a_valid_password() {
        login_page.pasaport.sendKeys("Manager1!");

    }
    @Given("User click the Login button")
    public void user_click_the_login_button() throws InterruptedException {
        login_page.login_Buton2.click();
        Thread.sleep(5000);
    }
    @Given("User click the Hotel management button")
    public void user_click_the_hotel_management_button() throws InterruptedException {
        addRoomPage.hotelManagementLink.click();
        Thread.sleep(2000);
    }
    @Given("User click the Hotel List button")
    public void user_click_the_hotel_list_button() throws InterruptedException {
        addRoomPage.hotelListLink.click();
        Thread.sleep(2000);
    }
    @Given("User click the ADD HOTEL button in the top right corner")
    public void user_click_the_add_hotel_button_in_the_top_right_corner() {
        addRoomPage.addHotelButton.click();
    }
    @Given("User enter a valid code")
    public void user_enter_a_valid_code() {
        addRoomPage.addHotelCode.sendKeys("7210");
    }
    @Given("User enter a valid name")
    public void user_enter_a_valid_name() {
        addRoomPage.addHotelName.sendKeys(faker.name().fullName());
    }
    @Given("User enter a valid address")
    public void user_enter_a_valid_address() {
        addRoomPage.addHotelAddress.sendKeys(faker.address().fullAddress());
    }
    @Given("User enter a valid phone number")
    public void user_enter_a_valid_phone_number() {
        addRoomPage.addHotelPhone.sendKeys(faker.phoneNumber().cellPhone());
    }
    @Given("User enter a valid Gmail address")
    public void user_enter_a_valid_gmail_address() {
        addRoomPage.addHotelEmail.sendKeys(faker.internet().emailAddress());
    }
    @Given("User select a valid ID group")
    public void user_select_a_valid_ıd_group() {
        Select dropdownElement = new Select(addRoomPage.addHotelIDGroup);
        dropdownElement.selectByVisibleText("Hotel Type2");
    }
    @Given("User click the Save button")
    public void user_click_the_save_button() {
        addRoomPage.addHotelbtnSubmit.click();
    }
    @Then("User see a message that the hotel was added successfully")
    public void user_see_a_message_that_the_hotel_was_added_successfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(addRoomPage.popuppossitivemessage.getText(), "Hotel was inserted successfully");
    }
    @Given("User leave the Code textbox empty")
    public void user_leave_the_code_textbox_empty() {
        addRoomPage.addHotelCode.sendKeys("");
    }
    @Given("User leave the Name textbox empty")
    public void user_leave_the_name_textbox_empty() {
        addRoomPage.addHotelName.sendKeys("");
    }
    @Given("User leave the Email textbox empty")
    public void user_leave_the_email_textbox_empty() {
        addRoomPage.addHotelEmail.sendKeys("");
    }
    @Given("User leave the ID Group dropdown empty")
    public void user_leave_the_ıd_group_dropdown_empty() {
        Select dropdownElement = new Select(addRoomPage.addHotelIDGroup);
        dropdownElement.selectByVisibleText("");

    }
    @Given("User leave the Address textbox empty")
    public void user_leave_the_address_textbox_empty() {
        addRoomPage.addHotelAddress.sendKeys("");
    }
    @Given("User enter a letter in the Phone textbox")
    public void user_enter_a_letter_in_the_phone_textbox() {
        addRoomPage.addHotelPhone.sendKeys("");
    }
    @Then("User see an error message")
    public void user_see_an_error_message() throws InterruptedException {
        System.out.println("Please enter valid data");
            }
        }