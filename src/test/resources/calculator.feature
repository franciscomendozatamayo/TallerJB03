Feature: Calculator
  Scenario: As an user I want to add two number

    Given que tengo acceso a mi calculadora
    When presiono el boton 9
    And presiono el boton +
    And presiono el boton 8
    Then al presionar la igualdad
    And el resultado deberia ser "17"