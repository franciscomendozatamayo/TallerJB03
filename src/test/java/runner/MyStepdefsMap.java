package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class MyStepdefsMap {
    @Given("accedo al manejador de contactos")
    public void accedoAlManejadorDeContactos() {
    }

    @When("creo un nuevo contacto")
    public void creoUnNuevoContacto(Map<String,String> userData) {

        for (String name: userData.keySet()
        ) {
            System.out.println("user form: campo: "+name+" con el valor: "+userData.get(name));
        }
    }

    @Then("el contacto deberia estar creado")
    public void elContactoDeberiaEstarCreado() {


    }
}
