package conf;

import static org.junit.Assert.fail;

/**
 * Created by alyona on 11/27/2015.
 */
public class TestAsserts {

    public static void assertTrue(boolean condition){
        if (condition){
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
            fail();
        }
    }


}
