@Test01
Feature: TestPage

  Background:
    Given user is on homePage
    When user click on UyePanel i button
    And user click on Yeni Uyelik
    Then user verifies that on the uyelik page

  @Test02
  Scenario Outline: Test_the_page
    Given user select official institution
    And user select any country
    And user select producer
    And user select any city
    When user enters sirket_unvani "<company_name>"
    When user enters kurumsal_iban "<company_iban>"
    When user enters kurumsal_web_sitesi"<company_website>"
    When user enters kurumsal_e_posta "<company_email>"
    When user enters sirket_adresi "<company_adress>"
    When user enters vergi_dairesi "<tax_box>"
    When user enters vergi_numarasi "<tax_number>"
    When user enters sabit_telefon "<land_phone>"
    When user enters mobil_telefon "<mobile_phone>"
    When user enters yetkili_ad_soyad "<official_name_surname>"
    When user enters yetkili_e_posta "<official_email>"
    When user enters yetkili_gsm "<official_phone>"
    And user click on agreement
    And user click on enrol button
     And user close browser
    Examples:
      | company_name                 | company_iban             | company_website | company_email     | company_adress                    | tax_box | tax_number | land_phone   | mobile_phone | official_name_surname | official_email      | official_phone |
      | AbgroupAbgroupAbgroupAbgroup | TR1234000000200012233412 | www.abgroup.com | abgroup@gmail.com | kartal mah. cevizli sok numara 18 | Kartal  | 1234567890 | 507-126-4567 | 5346768768   | Musa Yıldız           | abberk123@gmail.com | 5379789789     |





