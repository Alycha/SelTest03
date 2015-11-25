package elements;

import org.openqa.selenium.By;

/**
 * Created by Alycha on 11/10/2015.
 */
public class Checkbox extends Element {
    public Checkbox(By by) {
        super(by);
    }

    public void check(){
        if(!composeWebElement().isSelected()){
            composeWebElement().click();
        }else{
            return;
        }
    }



}
