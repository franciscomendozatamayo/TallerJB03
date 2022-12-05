package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("Estoy en {}")
    public void estoyEnFacebook(String appName) {
    }

    @When("Ingreso mi usuario: {string}")
    public void ingresoMiUsuarioFrancisco(String Username) {
    }

    @And("Ingreso mi passsword: {string}")
    public void ingresoMiPassswordPwd(String Password) {
    }

    @And("Realizo click en boton iniciar sesion")
    public void realizoClickEnBotonIniciarSesion() {
    }

    @Then("Yo deberia de ingresar a la aplicacion")
    public void yoDeberiaDeIngresarALaAplicacion() {
    }

    @Then("Yo No deberia de ingresar a la aplicacion")
    public void yoNoDeberiaDeIngresarALaAplicacion() {

    }
}
