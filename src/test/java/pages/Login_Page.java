package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login_Page {
    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[contains(text(),'Log in')]" )
    public WebElement loginButonu;

    @FindBy(id ="UserName" )
    public WebElement username;

    @FindBy(id ="Password" )
    public WebElement pasaport;

    @FindBy(id ="btnSubmit" )
    public WebElement login_Buton2;

    @FindBy(xpath="//*[@id=\"details-button\"]")
    public WebElement advancedLink;

    @FindBy(xpath="//*[@id=\"proceed-link\"]")
    public WebElement proceedLink;

   // @FindBy(xpath="//*[@id=\"details-button\"]")
   // public WebElement gelismisButon;

    @FindBy(id="//*[@id=\"divMessageResult\"]/div/ul/li/text()")
    public WebElement yanlisusernameveyapasporttexti;

    @FindBy(xpath="//*[@id=\"navProfile\"]/a")
    public WebElement profilButon;

    @FindBy(xpath="//a[text()='Contact']")
    public WebElement contactButon;




}
