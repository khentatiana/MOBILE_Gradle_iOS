package lc.forward.qa.mobile.android.env;

import java.util.Optional;

public class GetEnv {
    public static String getEnv(String envName){
        return Optional.ofNullable(System.getProperty(envName)).orElse("Default").toUpperCase().trim();
    }
}
