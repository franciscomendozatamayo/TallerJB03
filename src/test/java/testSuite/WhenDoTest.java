package testSuite;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MyListScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.net.MalformedURLException;

public class WhenDoTest {

    MyListScreen myListScreen= new MyListScreen();
    CreateTaskScreen createTaskScreen= new CreateTaskScreen();
    @Test
    public void verifyCreateTask() throws MalformedURLException {
        myListScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setText("JBGroup");
        createTaskScreen.noteTextBox.setText("movile");
        createTaskScreen.saveButton.click();

        Assertions.assertTrue(myListScreen.taskIsDisplayed("JBGroup"),
                "ERROR! the task was not created");

    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }


}
