package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasicAppium2 {


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
        // implicit waits
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterEach
    public void closeApp(){

        driver.quit();

    }

    @Test
    public void verifyCalculator() throws InterruptedException {

        driver.findElement(By.xpath("//*[@text='8']")).click();
        driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
        driver.findElement(By.xpath("//*[@text='9']")).click();
        driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
        //Explicit Wait
        WebDriverWait explicitWait = new WebDriverWait(driver,15);
        explicitWait.until(ExpectedConditions.textToBe(By.xpath("//*[contains(@resource-id,'result')]"),"17"));

        //Fluent

        String expectedResult = "17";
        String actualResult = driver.findElement(By.xpath("//*[contains(@resource-id,'result')]")).getText();
        Assertions.assertEquals(expectedResult, actualResult, "Error - La Suma es incorrecta");

    }

}// end BasicAppium2
