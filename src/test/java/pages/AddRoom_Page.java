package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddRoom_Page {
    public AddRoom_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='navRooms']//a[1]")
    public WebElement roomsButton;
    @FindBy(id = "checkin_date")
    public WebElement checkin_date;
    @FindBy(xpath = "(//td[text()='3'])[2]")
    public WebElement checkin_enter;
    @FindBy(id = "checkout_date")
    public WebElement checkout_date;
    @FindBy(xpath = "(//td[text()='9'])[2]")
    public WebElement checkout_enter;
    @FindBy(xpath = "//option[text()='Triple']")
    public WebElement roomType;
    @FindBy(xpath = "//option[text()='1 Adult']")
    public WebElement AdultCount;
    @FindBy(xpath = "//option[text()='1 Children']")
    public WebElement ChildrenCount;
    @FindBy(id = "location")
    public WebElement locationBox;
    @FindBy(xpath = "//input[@value='Search']")
    public WebElement searchButtonBox;
    @FindBy(id = "location")
    public WebElement location;
    @FindBy(xpath = "//option[text()='2025']")
    public WebElement CreditCardExpYear;
    @FindBy(xpath = "//option[text()='August']")
    public WebElement CreditCardExpMonth;
    @FindBy(id = "NameOnCreditCard")
    public WebElement NameOnCreditCard;
    @FindBy(id = "CreditCardNumber")
    public WebElement CreditCardNumber;
    @FindBy(id = "CVV")
    public WebElement cvv;
    @FindBy(id = "Message")
    public WebElement MessageBox;

    @FindBy(xpath = "//input[@value='Book this room']")
    public WebElement bookThisRoomButton;

    @FindBy(xpath = "(//button[@type='button']/following-sibling::div)[2]")
    public WebElement popupText;
    @FindBy(partialLinkText = "Hotel Management")
    public WebElement hotelManagementLink;
    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListLink;
    @FindBy(xpath = "//a[contains(.,'Add Hotel')]")
    public WebElement addHotelButton;
    @FindBy(id = "Code")
    public WebElement addHotelCode;
    @FindBy(id = "Name")
    public WebElement addHotelName;
    @FindBy(id = "Address")
    public WebElement addHotelAddress;
    @FindBy(id = "Phone")
    public WebElement addHotelPhone;
    @FindBy(id = "Email")
    public WebElement addHotelEmail;
    @FindBy(id = "IDGroup")
    public WebElement addHotelIDGroup;
    @FindBy(id = "btnSubmit")
    public WebElement addHotelbtnSubmit;
    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement popuppossitivemessage;







}
