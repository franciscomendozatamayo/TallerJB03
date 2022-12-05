package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

import java.net.MalformedURLException;

public class AppiumControl {

    protected By locator;
    protected WebElement control;

    public AppiumControl(By locator){
        this.locator=locator;
    }

    public void findControl() throws MalformedURLException {
        this.control= Session.getInstance().getDevice().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return this.control.getText();
    }


    public boolean isControlDisplayed() throws MalformedURLException {
        try {
            this.findControl();
            return this.control.isEnabled();
        }catch (Exception e){
            return false;
        }
    }
}
