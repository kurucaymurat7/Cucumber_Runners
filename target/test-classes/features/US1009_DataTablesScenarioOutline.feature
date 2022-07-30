Feature: US1009 DataTables sitesine 5 farkli giris yapalim

  @wip
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "dataTablesUrl" sayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" girer
    And kullanici 1 sn bekler
    And soyisim bolumune "<lastname>" girer
    And kullanici 1 sn bekler
    And position bolumune "<position>" girer
    And kullanici 1 sn bekler
    And ofis bolumune "<office>" girer
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" girer
    And kullanici 1 sn bekler
    And startdate bolumune "<startDate>" girer
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" girer
    And kullanici 1 sn bekler
    And Create tusuna basar
    And kullanici 1 sn bekler
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular

    Examples:
      | firstname | lastname | position | office | extension | startDate  | salary |  |
      | Alim      | Alim     | qa       | ankara | UI        | 2009-10-19 | 10000  |  |
      | Berk      | Can      | tester   | ankara | api       | 2022-05-05 | 11000  |  |
      | Huseyin   | Kacmaz   | BA       | berlin | -         | 2022-07-05 | 40000  |  |
      | Fatih     | Sahin    | PO       | berlin | -         | 2022-03-12 | 45000  |  |
      | Ahmet     | Kaya     | Tester   | ankara | database  | 2022-06-16 | 11000  |  |
