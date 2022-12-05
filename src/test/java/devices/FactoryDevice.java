package devices;

import devices.Android;
import devices.IDevice;
import devices.Ios;
import devices.WindowsPhone;

public class FactoryDevice {

    public static IDevice make(String deviceType){
        IDevice device;
        switch (deviceType.toLowerCase()){
            case "android":
                device = new Android();
                break;
            case "ios":
                device = new Ios();
                break;
            case "cloud":
                device = new AndroidCloud();
                break;
            default:
                device = new WindowsPhone();
                break;
        }
        return device;
    }

}
