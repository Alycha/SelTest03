package pages;

import data.Locators;
import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

import static conf.TestManager.getDriver;

/**
 * Created by Alycha on 11/10/2015.
 */
public class LoginPage {
//alonya.potter
    private Button nextButton = new Button(By.id(Locators.LOGIN_NEXT.getValue()));
    private TextInput emailInput = new TextInput(By.id(Locators.LOGIN_EMAIL.getValue()));

    public LoginPage enterLogin(String login){
        emailInput.type(login);
        return this;
    }

    public PasswordPage pressNext() {
        nextButton.click();
        return new PasswordPage();
    }



}

