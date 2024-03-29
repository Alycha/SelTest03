package tests;

import conf.TestManager;
import org.junit.Test;
import pages.InboxPage;
//import static org.junit.Assert.assertTrue;
import static conf.TestAsserts.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Random;

/**
 * Created by alyona on 11/25/2015.
 */
public class DeleteEmail extends TestManager{
    InboxPage inbox;
    private StringBuilder initialBody = new StringBuilder("Body ");
    private int randomIntToBody = new Random().nextInt(50);
    private String randomBody = new String(initialBody.append(randomIntToBody));

        @Test
    public void deleteEmail(){
        InboxPage inbox = mainPage.login().getInboxPage();
        inbox.sendEmail("alycha.sourceit@gmail.com", randomBody);
        assertTrue(inbox.isEmailPresent("alycha.sourceit@gmail.com"));
        assertTrue(inbox.isBodyPresent(randomBody));
        inbox.deleteEmail(randomBody);
        assertTrue(inbox.isDeleted(randomBody));

    }

}
