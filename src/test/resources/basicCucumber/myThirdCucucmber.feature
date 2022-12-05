Feature: my first Feature

  Background:
    Given Estoy en Facebook

  Scenario: As an user i want to ...
    When Ingreso mi usuario: "framciscomendozatamayo@gmail.com"
    And Ingreso mi passsword: "#Y180918y"
    And Realizo click en boton iniciar sesion
    Then Yo deberia de ingresar a la aplicacion


  Scenario: As an user i want to ...
    When Ingreso mi usuario: "NoExiste"
    And Ingreso mi passsword: "NoExiste"
    And Realizo click en boton iniciar sesion
    Then Yo No deberia de ingresar a la aplicacion



  Scenario: As an user i want to ...
    And Realizo click en boton iniciar sesion
    Then Yo No deberia de ingresar a la aplicacion

