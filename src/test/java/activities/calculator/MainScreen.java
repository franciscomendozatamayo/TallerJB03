package activities.calculator;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class MainScreen {

    public Button addButton= new Button(By.id("com.android.calculator2:id/op_add"));
    public Button equalButton = new Button(By.id("com.android.calculator2:id/eq"));
    public Button eightButton = new Button(By.id("com.android.calculator2:id/digit_8"));
    public Button nineButton = new Button(By.id("com.android.calculator2:id/digit_9"));
    public Label resultLabel = new Label(By.id("com.android.calculator2:id/result"));

    public Map<String , Button> buttonMap = new HashMap<>();

    public MainScreen(){
        buttonMap.put("add",addButton);
        buttonMap.put("equal",equalButton);
        buttonMap.put("8",eightButton);
        buttonMap.put("9",nineButton);


    }
}
