@wip
Feature: US1002 Kullanici ortak adimlari background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda

    @Login
    Scenario: TC04 amazon nutella arama
      And kullanici Nutella icin arama yapar
      Then sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir

      Scenario: TC05 amazon java arama
        And kullanici Java icin arama yapar
        And sonuclarin Java icerdigini test eder
        And sayfayi kapatir
