package runner;

import activities.calculator.MainScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;

public class MyStepCleanCalculator {
    MainScreen mainScreen = new MainScreen();
    @Given("I have access to calculator")
    public void iHaveAccessToCalculator() {
    }

    @When("I click in the {string} button")
    public void iClickInTheButton(String value) throws MalformedURLException {
        mainScreen.buttonMap.get(value).click();
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expectedResult) throws MalformedURLException {
        String actualResult = mainScreen.resultLabel.getText();
        Assertions.assertEquals(expectedResult, actualResult, "ERROR la suma es incorrecta");
    }
}
