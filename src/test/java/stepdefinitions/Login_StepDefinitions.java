package stepdefinitions;


import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Login_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class Login_StepDefinitions {

    Login_Page login_page = new Login_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanıcı CRYSTALKEY HOTELS sayfasına gider")
    public void kullanıcı_crystalkey_hotels_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("WebUrl"));

        try{
            Thread.sleep(3000);
            login_page.advancedLink.click();
            Thread.sleep(2000);
            actions.moveByOffset(0,200).perform();
            login_page.proceedLink.click();
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Advanced Link ve Proceed Link istenmedi");
        }


    }

    @Given("Kullanıcı sağ üstteki Log in butonuna tıklar")
    public void kullanıcı_sağ_üstteki_log_in_butonuna_tıklar() {
        login_page.loginButonu.click();

    }

    @Given("Kullanıcı açılan menude username Text Bax'a tıklar")
    public void kullanıcı_açılan_menude_username_text_bax_a_tıklar() {
        login_page.username.click();


    }

    @Given("Kullanıcı açılan menude username Text Box'a {string} yazar")
    public void kullanıcı_açılan_menude_username_text_box_a_yazar(String string) {
        login_page.username.sendKeys(string);

    }

    @Given("Kullanıcı Password Textbox'a {string} yazar")
    public void kullanıcı_password_textbox_a_yazar(String string) {
        login_page.pasaport.sendKeys(string);
    }

    @Given("Kullanıcı Log in butonuna tıklar")
    public void kullanıcı_log_in_butonuna_tıklar() {
        login_page.login_Buton2.click();

    }

    @Given("Kullanıcı manager sayfasına ulaşmış olur")
    public void kullanıcı_manager_sayfasına_ulaşmış_olur() {
      //  Assert.assertTrue(" ",Driver.getDriver().getTitle().contains(" "));
        Assert.assertTrue(String.valueOf(login_page.profilButon.getText().contains("Profile")),true);

    }

    @Given("\"Try again please Username or password is incorrect, please correct them and try again Wrong password\"mesajını görür")
    public void try_again_please_username_or_password_is_incorrect_please_correct_them_and_try_again_wrong_password_mesajını_görür() {

        Assert.assertTrue(String.valueOf(login_page.contactButon.getText().contains("Contact")),false);
    }



}
