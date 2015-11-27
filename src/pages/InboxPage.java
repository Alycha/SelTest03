package pages;

import data.EmailData;
import data.Locators;
import elements.Button;
import elements.Checkbox;
import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;
import static conf.TestManager.getDriver;
import static conf.TestManager.waitInSeconds;

/**
 * Created by Alycha on 11/13/2015.
 */
public class InboxPage {
    private Button composeButton = new Button(By.className(Locators.COMPOSE_EMAIL.getValue()));
    private Button sendButton = new Button(By.xpath(Locators.SEND_EMAIL.getValue()));
    private Button email = new Button(By.xpath(Locators.EMAIL.getValue()));
    private Button refreshButton = new Button(By.xpath(Locators.REFRESH_INBOX.getValue()));
    private Button deleteButton = new Button(By.xpath(Locators.DELETE_EMAIL.getValue()));
    private Button archiveButton = new Button(By.xpath(Locators.ARCHIVE_EMAIL.getValue()));
    private Button moreButton = new Button(By.xpath(Locators.MORE.getValue()));
    private Button allMailButton = new Button(By.xpath(Locators.ALL_EMAIL.getValue()));
    private Button trashButton = new Button(By.xpath(Locators.TRASH.getValue()));
    private Button bodyButton(String randomBody){
        return new Button(By.xpath("//span[contains(text(),'"+randomBody+"')]"));
    }
    private Checkbox emailCheckBox(String randomBody){
        return new Checkbox(By.xpath("//span[contains(text(),'"+randomBody+"')]/../../../../..//div[@role='checkbox']"));
    }

    private TextInput receiverInput = new TextInput(By.className(Locators.RECEIVER_INPUT.getValue()));
    private TextInput subjectInput = new TextInput(By.className(Locators.SUBJECT_INPUT.getValue()));
    private TextInput bodyInput = new TextInput(By.xpath(Locators.BODY_INPUT.getValue()));
//    protected EmailData emailData;

    public InboxPage sendEmail(String address, String randomBody) {
        composeButton.waitForElement();
        composeButton.click();
        sendButton.waitForElement();
        receiverInput.type(address);
        subjectInput.type("Subject");
        bodyInput.type(randomBody);
        sendButton.click();
        //waitInSeconds(5);
        refreshButton.click();
        return this;
    }

    public boolean isEmailPresent(String s) {
        email.waitForElement();
        return email.isPresent();
    }

    public boolean isBodyPresent(String randomBody) {
        bodyButton(randomBody).waitForElement();
        return bodyButton(randomBody).isPresent();
    }


    public void deleteEmail(String randomBody) {
        emailCheckBox(randomBody).check();
        waitInSeconds(1);
        deleteButton.click();
    }

    public boolean isDeleted(String randomBody) {
        waitInSeconds(1);
        moreButton.click();
        trashButton.click();
        bodyButton(randomBody).waitForElement();
        return bodyButton(randomBody).isPresent();
    }

    public void archiveEmail(String randomBody) {
        emailCheckBox(randomBody).check();
        waitInSeconds(1);
        archiveButton.click();
    }

    public boolean isArchived(String randomBody) {
        waitInSeconds(1);
        moreButton.click();
        allMailButton.click();
        bodyButton(randomBody).waitForElement();
        return bodyButton(randomBody).isPresent();
    }



}


