Feature: Maps

  Scenario: Example Maps

    Given accedo al manejador de contactos
    When creo un nuevo contacto

      | nombre    | eynar          |
      | telefono  | 5542345634     |
      | direccion | Av. Cuitlahuac |

    Then el contacto deberia estar creado
