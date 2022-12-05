Feature: my first Feature

  Scenario Outline: As an user i want to ...
    Given Estoy en Facebook
    When Ingreso mi usuario: "<Username>"
    And Ingreso mi passsword: "<Password>"
    And Realizo click en boton iniciar sesion
    Then Yo deberia de ingresar a la aplicacion

    Examples:
      | Username    | Password    |
      | Username123 | Password123 |
      | Username345 | Password456 |
      | Username567 | Password789 |
      | Username923 | Password945 |
