Feature: List

  @SmokeTest
  Scenario: Example List
    Given ingreso a mi manejador de contactos
    When yo busco al grupo familia
    Then los siguientes contactos deberia ser mostrados

      | francisco@gmail.com |
      | eynar@gmail.com     |
      | admin@gmail.com     |
      | test@gmail.com      |
      | karina@gmail.com    |