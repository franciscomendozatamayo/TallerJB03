package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepdefsList {
    @Given("ingreso a mi manejador de contactos")
    public void ingresoAMiManejadorDeContactos() {
    }

    @When("yo busco al grupo familia")
    public void yoBuscoAlGrupoFamilia() {
    }

    @Then("los siguientes contactos deberia ser mostrados")
    public void losSiguientesContactosDeberiaSerMostrados(List<String> contact) {

        for (String c:contact){

            System.out.println("Mi contacto contacto es: --->"+c);

        }

    }
}
