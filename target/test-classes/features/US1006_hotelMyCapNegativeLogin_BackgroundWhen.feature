#hotelmycamp sitesinde 3 adet negative test senaryosu olusturalim.
# 1-dogru username yanlis password
# 2-yanlis username dogru password
# 3-yanlis username yanlis password

@smoke
Feature: US1006 yanlis bilgilerde siteye giris yapilmali

  Background: kullanici sayfada
    When kullanici "HMCUrl" anasayfasinda

  Scenario: TC09 yanlis password ile giris yapilamaz
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And login butonuna basar
    Then sayfaya giris yapilamadagini test eder
    And sayfayi kapatir

  Scenario: TC10 yanlis kullanici adi ile giris yapilamaz
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadagini test eder

  Scenario: TC11 yanlis kullanici adi ve yanlis sifre giris yapilamaz
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadagini test eder


