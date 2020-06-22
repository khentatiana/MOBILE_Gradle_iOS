package lc.forward.qa.mobile.android;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAndroidTest extends BaseAndroid{

@BeforeMethod
    public void setUpTest(){
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("appPackage", "com.littlecaesars");
    desiredCapabilities.setCapability("appActivity", ".splash.SplashActivity");
}

@Test
    public void clickUnitedStatesButton(){
    MobileElement unitedStatesButton = (MobileElement)driver.findElementById("com.littlecaesars:id/usa");
    System.out.println(unitedStatesButton.getText());

}

}
