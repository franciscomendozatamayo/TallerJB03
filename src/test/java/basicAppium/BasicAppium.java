package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicAppium {

    AppiumDriver driver;

    @BeforeEach
    public void configure() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel 2 API 28");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.android.calculator2");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        capabilities.setCapability("platformName","Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @AfterEach
    public void closeApp(){

        driver.quit();

    }

    @Test
    public void verifyCalculator() throws InterruptedException {

        driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();

        Thread.sleep(5000);
        String expectedResult = "17";
        String actualResult = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assertions.assertEquals(expectedResult, actualResult, "Error - La Suma es incorrecta");

    }





}// end BasicAppium
