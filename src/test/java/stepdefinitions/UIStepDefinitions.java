package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class UIStepDefinitions {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("user is on homePage")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
    }

    @When("user click on UyePanel i button")
    public void userClickOnUyePanelIButton() {
        //actions.moveToElement(homePage.yeni_uyelik);
        homePage.uye_panel.click();

    }

    @And("user click on Giris")
    public void userClickOnGiris() {
        homePage.giris.click();
    }

    @Then("user verifies that it seems UYE GIRIS EKRANI header")
    public void userVerifiesThatItSeemsUYEGIRISEKRANIHeader() {
        Assert.assertEquals("ÜYE GİRİŞ EKRANI",homePage.header.getText());
    }

    @And("user enters email textbox")
    public void userEntersEmailTextbox() {
        homePage.first_box.sendKeys("");
    }

    @And("user enters password the box")
    public void userEntersPasswordTheBox() {
        homePage.second_box.sendKeys("");
    }

    @And("user click on Yeni Uyelik")
    public void userClickOnYeniUyelik() throws InterruptedException {
        Thread.sleep(3000);
        homePage.yeni_uyelik.click();
    }

    @Then("user verifies that on the uyelik page")
    public void userVerifiesThatOnTheUyelikPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("uyelik"));
    }

    @And("user select any country")
    public void userSelectAnyCountry() {
        Select select =new Select(homePage.ulke_box);
        select.selectByIndex(1);
    }

    @And("user select any city")
    public void userSelectAnyCity() {
        Select select =new Select(homePage.sehir_box);
        select.selectByIndex(6);
    }

    @And("user select official institution")
    public void userSelectOfficialInstitution() {
        Select select =new Select(homePage.uyelik_tipi_box);
        select.selectByIndex(1);
    }

    @And("user select producer")
    public void userSelectProducer() throws InterruptedException {
        Select select =new Select(homePage.uyelik_turu_box);
        Thread.sleep(1000);
        select.selectByIndex(1);
    }

    @When("user enters {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void userEnters(String company_name, String company_iban, String company_website, String company_email, String company_adress, String tax_box, String tax_number, String land_phone, String mobile_phone, String official_name_surname, String official_email, String official_phone) {
        homePage.company_name.sendKeys(company_name);
        homePage.company_iban.sendKeys(company_iban);
        homePage.company_website.sendKeys(company_website);
        homePage.company_email.sendKeys(company_email);
        homePage.company_adress.sendKeys(company_adress);
        homePage.tax_box.sendKeys(tax_box);
        homePage.tax_number.sendKeys( tax_number);
        homePage.land_phone.sendKeys(land_phone);
        homePage.mobile_phone.sendKeys( mobile_phone);
        homePage.official_name_surname.sendKeys(official_name_surname);
        homePage.official_email.sendKeys(official_email);
        homePage.official_phone.sendKeys(official_phone);
    }
    @And("user click on agreement")
    public void userClickOnAgreement() {

        homePage.agreement.click();

    }
    @And("user click on enrol button")
    public void userClickOnEnrolButton() {
        homePage.enrol.click();
    }

    @And("user close browser")
    public void userCloseBrowser() {
        Driver.closeDriver();
    }
}
