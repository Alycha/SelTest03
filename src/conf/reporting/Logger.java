package conf.reporting;

import org.testng.Reporter;

/**
 * Created by Alycha on 11/20/2015.
 */
public class Logger {
    public static void log(String message) {
        Reporter.log(message + "<br>");
    }

    public static void log(int i) {
        log("" + i);
    }

    public static void log(boolean b) {
        log("" + b);
    }

    public static void title(String message) {
        log("<h3>" + message + "</h3>");
    }
}
