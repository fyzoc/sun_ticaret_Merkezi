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
        homePage.uye_panel.click();

    }
    @And("user click on Giris")
    public void userClickOnGiris() {
        homePage.giris.click();
    }

    @Then("user verifies that it seems UYE GIRIS EKRANI header")
    public void userVerifiesThatItSeemsUYEGIRISEKRANIHeader() {
        Assert.assertEquals("ÜYE GİRİŞ EKRANI", homePage.header.getText());
    }
    @And("user click on Yeni Uyelik")
    public void userClickOnYeniUyelik() throws InterruptedException {
        Thread.sleep(4000);
        homePage.yeni_uyelik.click();
    }
    @Then("user verifies that on the uyelik page")
    public void userVerifiesThatOnTheUyelikPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("uyelik"));
    }
    @And("user select any country")
    public void userSelectAnyCountry() {
        Select select = new Select(homePage.ulke_box);
        select.selectByIndex(1);
    }
    @And("user select any city")
    public void userSelectAnyCity() {
        Select select = new Select(homePage.sehir_box);
        select.selectByIndex(6);
    }
    @And("user select official institution")
    public void userSelectOfficialInstitution() {
        Select select = new Select(homePage.uyelik_tipi_box);
        select.selectByIndex(1);
    }
    @And("user select producer")
    public void userSelectProducer() throws InterruptedException {
        Select select = new Select(homePage.uyelik_turu_box);
        Thread.sleep(1000);
        select.selectByIndex(1);
    }
    @When("user enters sirket_unvani {string}")
    public void userEntersSirket_unvani(String company_name) {
        homePage.company_name.sendKeys(company_name);
    }
    @When("user enters kurumsal_iban {string}")
    public void userEntersKurumsal_iban(String company_iban) {
        homePage.company_iban.sendKeys(company_iban);
    }
    @When("user enters kurumsal_web_sitesi{string}")
    public void userEntersKurumsal_web_sitesi(String company_website) {
        homePage.company_website.sendKeys(company_website);
    }
    @When("user enters kurumsal_e_posta {string}")
    public void userEntersKurumsal_e_posta(String company_email) {
        homePage.company_email.sendKeys(company_email);
    }
    @When("user enters sirket_adresi {string}")
    public void userEntersSirket_adresi(String company_adress) {
        homePage.company_adress.sendKeys(company_adress);
    }
    @When("user enters vergi_dairesi {string}")
    public void userEntersVergi_dairesi(String tax_box) {
        homePage.tax_box.sendKeys(tax_box);
    }
    @When("user enters vergi_numarasi {string}")
    public void userEntersVergi_numarasi(String tax_number) {
        homePage.tax_number.sendKeys(tax_number);
    }
    @When("user enters sabit_telefon {string}")
    public void userEntersSabit_telefon(String land_phone) {
        homePage.land_phone.sendKeys(land_phone);
    }
    @When("user enters mobil_telefon {string}")
    public void userEntersMobil_telefon(String mobile_phone) {
        homePage.mobile_phone.sendKeys(mobile_phone);
    }
    @When("user enters yetkili_ad_soyad {string}")
    public void userEntersYetkili_ad_soyad(String official_name_surname) {
        homePage.official_name_surname.sendKeys(official_name_surname);
    }
    @When("user enters yetkili_e_posta {string}")
    public void userEntersYetkili_e_posta(String official_email) {
        homePage.official_email.sendKeys(official_email);
    }
    @When("user enters yetkili_gsm {string}")
    public void userEntersYetkili_gsm(String official_phone) {
        homePage.official_phone.sendKeys(official_phone);

    }
    @And("user click on agreement")
    public void userClickOnAgreement() throws InterruptedException {
        Thread.sleep(2000);
        homePage.agreement.click();
    }
    @And("user click on enrol button")
    public void userClickOnEnrolButton() throws InterruptedException {
        Thread.sleep(1000);
        homePage.enrol.click();
    }
    @And("user close browser")
    public void userCloseBrowser() {
        Driver.closeDriver();
    }
}
