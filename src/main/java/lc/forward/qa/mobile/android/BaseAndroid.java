package lc.forward.qa.mobile.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAndroid {

    protected AppiumDriver driver;
    @BeforeClass
    protected void beforeClass() throws Exception{
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.0");
        desiredCapabilities.setCapability("deviceName", "my_device_emulator-5554");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        desiredCapabilities.setCapability("avd", "Pixel_API_26");

        desiredCapabilities.setCapability("app", "/Users/tatiana/Desktop/PROJECTS/APK_downlods/little_ceasars.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);


    }
 @AfterClass
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }

 }

}
