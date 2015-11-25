package pages;


import data.Locators;
import elements.Button;
import elements.Checkbox;
import elements.TextInput;
import org.openqa.selenium.By;
import static conf.TestManager.getUserData;



/**
 * Created by Alycha on 11/10/2015.
 */
public class PasswordPage {
    private TextInput passwordInput = new TextInput(By.id(Locators.PWD_PWD_INPUT.getValue()));
    private Button nextButton = new Button(By.id(Locators.PWD_NEXT.getValue()));
    private Checkbox rememberMeCheckbox = new Checkbox(By.id(Locators.PWD_REMEMBER_ME.getValue()));

    public PasswordPage enterPassword() {
        passwordInput.waitForElement();
        passwordInput.type(getUserData().getPassword());
        return this;
    }

    public PasswordPage checkRememberMe(){
        rememberMeCheckbox.check();
        return this;
    }

    public MainPage clickSignIn() {
        nextButton.click();
        return new MainPage();
    }
}



