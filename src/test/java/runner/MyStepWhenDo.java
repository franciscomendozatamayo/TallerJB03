package runner;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MyListScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;
import java.util.Map;

public class MyStepWhenDo {
    MyListScreen myListScreen = new MyListScreen();
    CreateTaskScreen createTaskScreen = new CreateTaskScreen();
    @Given("I have access to WhenDo app")
    public void iHaveAccessToWhenDoApp() {
    }

    @When("I create a new task")
    public void iCreateANewTask(Map<String,String> data) throws MalformedURLException {
        myListScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setText(data.get("title"));
        createTaskScreen.noteTextBox.setText(data.get("note"));
        createTaskScreen.saveButton.click();
    }

    @Then("the task {string} should be created")
    public void theTaskShouldBeCreated(String expectedResult) throws MalformedURLException {
        Assertions.assertTrue(myListScreen.taskIsDisplayed(expectedResult),
                "ERROR! the task was not created: "+expectedResult    );

    }
}
