package testSuite;

import activities.calculator.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.net.MalformedURLException;

public class CalculatorTest {

    MainScreen mainScreen = new MainScreen();

    @Test
    public void verifyAddNumber() throws MalformedURLException {
        mainScreen.eightButton.click();
        mainScreen.addButton.click();
        mainScreen.nineButton.click();
        mainScreen.equalButton.click();
        Assertions.assertEquals("17",mainScreen.resultLabel.getText(),
                "ERROR!! the result is wrong");

    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }


}
