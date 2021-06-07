package lc.forward.qa.mobile.android.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.appium.java_client.AppiumDriver;
import lc.forward.qa.mobile.android.driver.AppiumInitDriver;
import lc.forward.qa.mobile.android.driver.MobileType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static lc.forward.qa.mobile.android.env.GetEnv.getEnv;


public abstract class BaseTest {
    public Logger logger = LogManager.getLogger(BaseTest.class);
    protected static AppiumDriver driver;

    @BeforeMethod
    protected void oneTimeSetUp() {
        driver = AppiumInitDriver.initiateAppiumDriver(getEnv("mobile"));
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            String mobileDriver = getEnv("mobile");
            driver.quit();
            System.out.println("=========" + mobileDriver + " browser is closed=====");
            logger.info("====={} browser is closed=====", mobileDriver);
        }
    }


}
