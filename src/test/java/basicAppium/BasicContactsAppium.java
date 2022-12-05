package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasicContactsAppium {

    AppiumDriver driver;

    @BeforeEach
    public void configure() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel 2 API 28");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.android.contacts");
        capabilities.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
        capabilities.setCapability("platformName","Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        // implicit waits
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterEach
    public void closeApp(){

        driver.quit();

    }

    @Test
    public void verifyContact() throws InterruptedException {

        String name = "NameAppium008";
        String lastName = "LastNameAppium008";
        String phone = "5542284958";
        driver.findElement(By.id("com.android.contacts:id/floating_action_button")).click();
        driver.findElement(By.xpath("//*[@text='First name']")).sendKeys(name);
        driver.findElement(By.xpath("//*[@text='Last name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys(phone);
        driver.findElement(By.xpath("//*[@text='SAVE']")).click();
        //Explicit Wait
        //WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //explicitWait.until(ExpectedConditions.textToBe(By.xpath("//*[@resource-id='com.android.contacts:id/large_title']"),name));

        String expectedResult = name + " " + lastName;
        String actualResult = driver.findElement(By.xpath("//*[@resource-id='com.android.contacts:id/large_title']")).getText();
        Assertions.assertEquals(expectedResult, actualResult, "Error -> Contacto No Creado");

    }


}
