package runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class MyStepdefsCalculator {
    AppiumDriver driver;

    @Given("que tengo acceso a mi calculadora")
    public void queTengoAccesoAMiCalculadora() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 2 API 28");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @When("presiono el boton {int}")
    public void presionoElBoton(int button) {
        if (button == 8)
            driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
        else
            driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
    }

    @And("presiono el boton +")
    public void presionoElBoton() {
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
    }

    @Then("al presionar la igualdad")
    public void alPresionarLaIgualdad() {
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    }

    @And("el resultado deberia ser {string}")
    public void elResultadoDeberiaSer(String expectedResult) throws InterruptedException {
        Thread.sleep(5000);
        String actualResult = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assertions.assertEquals(expectedResult, actualResult, "ERROR la suma es incorrecta");
    }

}
