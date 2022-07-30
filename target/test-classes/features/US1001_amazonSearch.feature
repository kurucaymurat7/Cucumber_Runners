@tumu
Feature: Amazon Search

  @nutella @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @java @ikisi
  Scenario: TC02 kullanici amazonda Java aratir
    * kullanici amazon anasayfasinda
    * kullanici Java icin arama yapar
    * sonuclarin Java icerdigini test eder
    * sayfayi kapatir

  @iphone
  Scenario: TC03 kullanici amazonda iphone aratir
    When kullanici amazon anasayfasinda
    And kullanici iphone icin arama yapar
    * sonuclarin iphone icerdigini test eder
    Then sayfayi kapatir