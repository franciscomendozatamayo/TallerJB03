Feature: Object

  Scenario: Example Object

    Given accedo al manejador de contactos
    And creo un contacto completo con:

      | nombre    | apellido | direccion     | telefono1  | telefono2   | alias | email               |
      | francisco | mendoza  | av cuitlahuac | 5543212345 | 55445987698 | Paco  | francisco@gmail.com |

    Then el contacto deberia estar creado