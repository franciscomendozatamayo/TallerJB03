package control;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class CheckBox extends AppiumControl{

    public CheckBox(By locator) {
        super(locator);
    }

    public void check() throws MalformedURLException {
        findControl();
        if (!control.isSelected()){
            control.click();
        }
    }

    public void uncheck() throws MalformedURLException {
        findControl();
        if (control.isSelected()){
            control.click();
        }
    }
}
