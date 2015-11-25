package tests;

import conf.TestManager;
import org.junit.Test;
import pages.InboxPage;
import java.util.Random;
import static org.junit.Assert.assertTrue;

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
        inbox.sendEmail("alonya.potter@gmail.com", randomBody);
        assertTrue(inbox.isEmailPresent("alonya.potter@gmail.com"));
        assertTrue(inbox.isBodyPresent(randomBody));
        inbox.deleteEmail(randomBody);

    }

//    @Test
//    public void deleteEmail(){
////        InboxPage inbox = mainPage.login().getInboxPage();
////        inbox.sendEmail("alonya.potter@gmail.com", randomBody);
////        assertTrue(inbox.isEmailPresent("alonya.potter@gmail.com"));
//        assertTrue(inbox.isBodyPresent(randomBody));
//        inbox.deleteEmail(randomBody);
////        assertFalse(inbox.isBodyPresent(randomBody));
//
//    }



}
