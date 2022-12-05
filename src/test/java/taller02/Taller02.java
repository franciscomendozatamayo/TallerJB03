package taller02;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Taller02 {


    AppiumDriver driver;

    @BeforeEach
    public void configure() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel 2 API 28");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
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
    public void verifyAdd() throws InterruptedException {
        // Add
        driver.findElement(By.xpath("//*[@resource-id='com.vrproductiveapps.whendo:id/fab']")).click();

        //Title
        String title = "Title001";
        driver.findElement(By.xpath("//*[@resource-id='com.vrproductiveapps.whendo:id/noteTextTitle']")).sendKeys(title);

        //Note
        String note = "Note001";
        driver.findElement(By.xpath("//*[@resource-id='com.vrproductiveapps.whendo:id/noteTextNotes']")).sendKeys(note);

        //Save
        driver.findElement(By.xpath("//*[@resource-id='com.vrproductiveapps.whendo:id/saveItem']")).click();

        //Explicit Wait
        //WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //explicitWait.until(ExpectedConditions.textToBe(By.xpath("//*[contains(@resource-id,'result')]"),"17"));


        String actualResultTitle = driver.findElement(By.xpath("//*[@text='Title001']")).getText();
        Assertions.assertEquals(title, actualResultTitle, "Title Incorrecto");

        String actualResultNote = driver.findElement(By.xpath("//*[@text='Note001']")).getText();
        Assertions.assertEquals(note, actualResultNote, "Note Incorrecto");

        Thread.sleep(3000);

    }
}
