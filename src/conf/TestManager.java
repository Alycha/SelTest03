package conf;

import conf.reporting.LoggingEventListener;
import data.Locators;
import data.UserData;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import pages.MainPage;

/**
 * Created by Alycha on 11/10/2015.
 */

public class TestManager {
    protected static WebDriver driver;
    private String baseUrl = "https://www.google.com.ua/";
    private static final WebDriverEventListener eventListener = new LoggingEventListener();
    protected MainPage mainPage;
    protected static UserData userData = new UserData(Locators.LOGIN.getValue(), Locators.PASSWORD.getValue());

    public static UserData getUserData(){
        return userData;
    }



    @Before
    public void setUp() {
        driver = new EventFiringWebDriver(new FirefoxDriver()).register(eventListener);
        getDriver().get(baseUrl);
        mainPage = new MainPage();
    }



    @After
    public void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void waitInSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
