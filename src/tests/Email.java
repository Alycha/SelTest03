package tests;

import conf.TestManager;
import org.junit.Test;
import pages.InboxPage;
import java.util.Random;
//import static org.junit.Assert.assertTrue;
import static conf.TestAsserts.assertTrue;

/**
 * Created by Alycha on 11/13/2015.
 */
public class Email extends TestManager {
    InboxPage inbox;
    private StringBuilder initialBody = new StringBuilder("Body ");
    private int randomIntToBody = new Random().nextInt(50);
    private String randomBody = new String(initialBody.append(randomIntToBody));

    @Test
    public void firstEmail(){
        InboxPage inbox = mainPage.login().getInboxPage();
        inbox.sendEmail("alycha.sourceit@gmail.com", randomBody);
        assertTrue(inbox.isEmailPresent("alycha.sourceit@gmail.com"));
        assertTrue(inbox.isBodyPresent(randomBody));


    }





}
