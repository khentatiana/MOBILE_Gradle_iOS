package lc.forward.qa.mobile.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import lc.forward.qa.mobile.android.base.BaseTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAndroid extends BaseTest {

   protected AppiumDriver driver;


    @BeforeClass
    protected void beforeClass() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.0");
        desiredCapabilities.setCapability("deviceName", "my_device_emulator-5554");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        desiredCapabilities.setCapability("avd", "Nexus_5_API_26");

        desiredCapabilities.setCapability("app", "/Users/tatiana/Desktop/PROJECTS/APK_downlods/forward.apk");

        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
       // String sessionId = driver.getSessionId().toString();



    }
 @AfterClass
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }

 }

}
