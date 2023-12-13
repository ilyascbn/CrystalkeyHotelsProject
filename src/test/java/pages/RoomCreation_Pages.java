package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomCreation_Pages {


public RoomCreation_Pages() {
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(id = "navLogon")
public WebElement loginButonu;

@FindBy(id = "UserName")
public WebElement username;

@FindBy(id = "Password")
public WebElement pasaport;

@FindBy(id = "btnSubmit")
public WebElement login_Buton2;

@FindBy(id = "//span[normalize-space()='Hotel Management']")
public WebElement hotelManagement;

@FindBy(xpath = "//a[normalize-space()='Hotel Rooms']")
public WebElement hotelRooms;

@FindBy(id = "//span[@class='hidden-480']")
public WebElement ADD_HOTELROOM;
@FindBy(id = "lkpHotels")
public WebElement iDHotel;

@FindBy(xpath = "//input[@name='Code']")
public WebElement code;
@FindBy(xpath = "//a[normalize-space()='Hotel Rooms']")
public WebElement hotelRoom;

@FindBy(xpath = "//input[@name='Name']")
public WebElement name;

@FindBy(xpath = "//input[@name='Location']")
public WebElement location;

@FindBy(xpath = "//textarea[@title='Rich Text Editor, Description']")
public WebElement description;

@FindBy(xpath = "//input[@id='Price']")
public WebElement price;

@FindBy(xpath = "//select[@id='IDGroupRoomType']")
public WebElement roomType;

@FindBy(xpath = "//input[@id='MaxAdultCount']")
public WebElement maxAdultCount;

@FindBy(xpath = "//input[@id='MaxChildCount']")
public WebElement maxChildrenCount;

@FindBy(xpath = "//input[@id='IsAvailable']")
public WebElement approved;

@FindBy(xpath = "//button[@id='btnSubmit']")
public WebElement SAVE;

@FindBy(xpath = "//button[normalize-space()='OK']")
public WebElement OK;


}
