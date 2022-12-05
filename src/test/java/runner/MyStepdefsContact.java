package runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MyStepdefsContact {
    AppiumDriver driver;
    @Given("tengo acceso a mi manejador de contacto")
    public void tengoAccesoAMiManejadorDeContacto() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 2 API 28");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.android.contacts");
        capabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        // implicit waits
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("agrego un contacto")
    public void agregoUnContacto(Map<String,String> data) {
        // click +
        driver.findElement(By.id("com.android.contacts:id/hw_fab")).click();
        // set name
        driver.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys(data.get("name"));
        //set phone
        driver.findElement(By.xpath("//android.widget.EditText[@text='Phone number']")).sendKeys(data.get("phone"));
        // click save
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Done\"]")).click();
    }

    @Then("el contacto {string} deberia ser creado")
    public void elContactoDeberiaSerCreado(String expectedResult) {
        String actualResult=driver.findElement(By.id("com.android.contacts:id/name")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR!! no se creo el contacto");
        driver.quit();
    }
}
