package lc.forward.qa.mobile.android;

import lc.forward.qa.mobile.android.screens.MainScreen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test001 {
    private MainScreen mainScreen;
    @BeforeMethod
    public void setUp(){
        mainScreen = new MainScreen();

    }

    @Test
    public void test(){
        mainScreen.clickCabinetButton().clickStoreButton();

    }
}
