Feature: US1010 herokuapp Delete testi

  @heroku
  Scenario: TC15 herokuapp'tan delete butonu calismasi

    Given kullanici "herokuappUrl" anasayfasinda
    And add element butonuna basar
    Then delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basar
    And Delete butonunun gorunmedigini test eder
