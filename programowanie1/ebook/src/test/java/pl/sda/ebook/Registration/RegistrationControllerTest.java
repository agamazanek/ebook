package pl.sda.ebook.Registration;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RegistrationControllerTest {
    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    @Test
    public void shouldCreateNewUser() {

        Response loginResult = new RegistrationController().createUser("testUser1", "passw1");

        Assert.assertEquals(true, loginResult.isSuccess());


    }  @Test
    public void shouldNotCreateNewUser() {

        Response loginResult = new RegistrationController().createUser("testUser1", "ss");

        Assert.assertEquals(false, loginResult.isSuccess());


    }
    /**
     * data OK & user not exits
     * Response { success: true }
     *
     * data OK & user exits
     * Response { success: false, msg: User already exist }
     *
     * data not OK
     * Response { success: false, msg: Password too short }
     */

}

