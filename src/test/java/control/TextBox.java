package control;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.net.MalformedURLException;

public class TextBox extends AppiumControl{

    public TextBox(By locator) {
        super(locator);
    }
    public void clearSet(String value) throws MalformedURLException {
        this.findControl();
        this.control.clear();
        this.control.sendKeys(value);
    }

    public void setText(String value) throws MalformedURLException {
        this.findControl();
        this.control.sendKeys(value);
    }
    public void setTextAndEnter(String value) throws MalformedURLException {
        this.findControl();
        this.control.sendKeys(value+ Keys.ENTER);
    }
}
