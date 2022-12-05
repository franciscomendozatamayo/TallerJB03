package singletonSession;

import devices.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {

    //attribute same type
    private static Session session = null;
    private AppiumDriver device;
    // constructor private
    private Session() throws MalformedURLException {
        device = FactoryDevice.make("android").create();
    }
    // method static -> return the same type
    public static Session getInstance() throws MalformedURLException {
        if (session == null)
            session = new Session();
        return session;
    }

    public void closeSession(){
        device.quit();
        session=null;
    }

    public AppiumDriver getDevice() {
        return device;
    }

}
