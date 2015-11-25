package elements;

import org.openqa.selenium.By;

/**
 * Created by Alycha on 11/10/2015.
 */
public class Button extends Element {

    public Button(By by){
        super(by);
    }

    public void click(){
        composeWebElement().click();
    }
}
