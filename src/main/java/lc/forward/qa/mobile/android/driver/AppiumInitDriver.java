package lc.forward.qa.mobile.android.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumInitDriver {


    private DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    public AppiumDriver initiateAppiumDriver(String mobileDriver) {
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            if (mobileDriver.equalsIgnoreCase("android")) {
                return new AndroidDriver(url, desiredCapabilities);
            } else {
                return new IOSDriver(url, desiredCapabilities);
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return null;
    }
}
