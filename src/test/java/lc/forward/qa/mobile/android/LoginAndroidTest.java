package lc.forward.qa.mobile.android;

import io.appium.java_client.android.AndroidDriver;
import lc.forward.qa.mobile.android.screens.MainScreen;
import org.testng.annotations.Test;

public class LoginAndroidTest extends BaseAndroid {

    @Test
    public void clickOkButtonTest() {
        MainScreen mainScreen = new MainScreen((AndroidDriver) driver);
        mainScreen.clickOkButton();
        logger.info("========OK button is clicked");


    }

}
