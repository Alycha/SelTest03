package elements;

import org.openqa.selenium.By;

import static conf.TestManager.getDriver;

/**
 * Created by Alycha on 11/10/2015.
 */
public class TextInput extends Element {

    public TextInput(By by){
        super(by);
    }


    public void type(String input){
        composeWebElement().clear();
        composeWebElement().sendKeys(input);

    }

}
