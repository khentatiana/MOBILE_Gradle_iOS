package lc.forward.qa.mobile.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FirstiOSTest {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability("udid", "d6830fb8f2be19a7dabf853936e261360b19dd5a");
        desiredCapabilities.setCapability("deviceName", "any device name iPhone 11");
        desiredCapabilities.setCapability("automationName", "XCUITest");
        desiredCapabilities.setCapability("bundleId", "net.whatsapp.WhatsApp");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AppiumDriver driver = new IOSDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();


    }
}
