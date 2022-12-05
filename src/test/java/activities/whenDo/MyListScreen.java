package activities.whenDo;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MyListScreen {

    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public boolean taskIsDisplayed(String taskName) throws MalformedURLException {
        Label task= new Label(By.xpath("//android.widget.TextView[@text='"+taskName+"']"));
        return task.isControlDisplayed();
    }
}
