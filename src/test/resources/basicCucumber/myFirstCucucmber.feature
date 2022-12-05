Feature: my first Feature

  @SmokeTest
  Scenario: As an user i want to ...
    #Comment
    Given Estoy en Facebook
    When Ingreso mi usuario: "framciscomendozatamayo@gmail.com"
    And Ingreso mi passsword: "#F180918m"
    And Realizo click en boton iniciar sesion
    Then Yo deberia de ingresar a la aplicacion