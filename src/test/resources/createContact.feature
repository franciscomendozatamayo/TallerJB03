Feature: Contact
  Scenario: As user i want to add a new contact so that using him

    Given tengo acceso a mi manejador de contacto
    When agrego un contacto
      |name | eynarRemove1|
      |phone| 1111111     |
    Then el contacto "eynarRemove1" deberia ser creado