package lc.forward.qa.mobile.android.env;

import lc.forward.qa.mobile.android.driver.AppiumInitDriver;
import lc.forward.qa.mobile.android.driver.MobileType;

public class MobileDriver extends AppiumInitDriver {
    public static MobileType getMobileDriver(String mobileDriver) {
        try {
            return MobileType.valueOf(mobileDriver.toUpperCase().trim());
        } catch (Exception e) {
            return MobileType.DEFAULT;
        }
    }
}
