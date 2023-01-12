package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath= "(//*[text()='Üye Paneli'])[1]")
    public WebElement uye_panel;
    @FindBy(linkText= "Giriş")
    public WebElement giris;
    @FindBy(xpath= "(//*[text()='ÜYE GİRİŞ EKRANI'])[1]")
    public WebElement header;
    @FindBy(xpath= "(//input[@class='form-control'])[1]")
    public WebElement first_box;
    @FindBy(xpath= "(//input[@class='form-control'])[2]")
    public WebElement second_box;
    @FindBy(id= "ContentPlaceHolder1_btnGiris")
    public WebElement sisteme_baglan;
    @FindBy(linkText= "Yeni Üyelik")
    public WebElement yeni_uyelik;
    @FindBy(id= "ContentPlaceHolder1_ddlUyelikTipi")
    public WebElement uyelik_tipi_box;
    @FindBy(id= "ContentPlaceHolder1_ddlUyelikTuru")
    public WebElement uyelik_turu_box;
    @FindBy(id= "ContentPlaceHolder1_ddlUlke")
    public WebElement ulke_box;
    @FindBy(id= "ContentPlaceHolder1_ddlIl")
    public WebElement sehir_box;

    @FindBy(id= "ContentPlaceHolder1_txtKurumsalSirketUnvani")
    public WebElement company_name;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalIBAN")
    public WebElement company_iban;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalWebSitesi")
    public WebElement company_website;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalEPosta")
    public WebElement company_email;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalSirketAdresi")
    public WebElement company_adress;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalVergiDairesi")
    public WebElement tax_box;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalVergiNo")
    public WebElement tax_number;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalSabitTelefon")
    public WebElement land_phone;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalMobilTelefon")
    public WebElement mobile_phone;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalYetkiliAdSoyad")
    public WebElement official_name_surname;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalYetkiliEPosta")
    public WebElement official_email;
    @FindBy(id= "ContentPlaceHolder1_txtKurumsalYetkiliGsm")
    public WebElement official_phone;
    @FindBy(id= "ContentPlaceHolder1_cbSozlesme")
    public WebElement agreement;
    @FindBy(id= "ContentPlaceHolder1_btnKurumsalUyeKaydet")
    public WebElement enrol;





}