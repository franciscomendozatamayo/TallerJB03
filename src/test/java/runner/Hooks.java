package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import singletonSession.Session;

import java.net.MalformedURLException;

public class Hooks {
    @Before
    public void beforeScenario(){
        System.out.println("esto es antes del scenario");
    }

    @After
    public void afterScenario() throws MalformedURLException {
        Session.getInstance().closeSession();
        System.out.println("esto es despues del scenario");
    }
}
