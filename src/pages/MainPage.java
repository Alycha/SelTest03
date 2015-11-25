package pages;

import data.Locators;
import elements.Button;
import org.openqa.selenium.By;
import static conf.TestManager.getDriver;
import static conf.TestManager.waitInSeconds;

/**
 * Created by Alycha on 11/10/2015.
 */
public class MainPage {
    private Button signInButton = new Button(By.id(Locators.GOOGLE_SIGNIN.getValue()));
    private Button closePopup = new Button(By.xpath(Locators.CLOSE_POPUP.getValue()));
    private Button googleApps = new Button(By.id(Locators.GOOGLE_APPS.getValue()));
    private Button gmailButton = new Button(By.id(Locators.GMAIL_APP.getValue()));

    public LoginPage clickLogIn(){
        signInButton.click();
        return new LoginPage();
    }

    public MainPage login(){
        clickLogIn().
                enterLogin(Locators.LOGIN.getValue()).
                pressNext().
                enterPassword().
                checkRememberMe().
                clickSignIn();
        waitInSeconds(5);
        return this;
    }

    public InboxPage getInboxPage(){
        closePopup.click();
        googleApps.waitForElement();
        googleApps.click();
        gmailButton.waitForElement();
        gmailButton.click();
        return new InboxPage();
    }

    public boolean isPresent() {
        return getDriver().getTitle().contains("Google");
    }
}
