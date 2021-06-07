package lc.forward.qa.mobile.android.screens;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import lc.forward.qa.mobile.android.BaseAndroid;



public class MainScreen extends lc.forward.qa.mobile.android.BaseAndroid{
    private AndroidDriver driver;

//   // public MainScreen clickOkButton() {
//        return this;
//    }

    WebElement okButton = driver.findElementById("android:id/button1");

    public MainScreen(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickOkButton() {
        okButton.click();
      //  return new MainScreen(driver);
    }
}
