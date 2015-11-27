package tests;

import conf.TestManager;
import data.Locators;
import data.UserData;
import org.junit.*;

import static org.junit.Assert.assertTrue;
//import static conf.TestAsserts.assertTrue;

/**
 * Created by Alycha on 11/10/2015.
 */

public class Login extends TestManager{



    @Test
    public void login() {
        mainPage.clickLogIn().
                enterLogin(userData.getLogin()).
                pressNext().
                enterPassword().
                clickSignIn();
        assertTrue("Incorrect page is displayed", mainPage.isPresent());

    }




}
