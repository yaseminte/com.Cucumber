Feature: US1003 Kullanici parametre kullanarak arama yapılabilmeli

  @parametre
  Scenario: Kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    Then sayfayi kapatir