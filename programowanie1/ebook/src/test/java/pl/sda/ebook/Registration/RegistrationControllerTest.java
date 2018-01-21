package pl.sda.ebook.Registration;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.ebook.UserData.User;
import pl.sda.ebook.UserData.UserDataBase;

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
        UserDataBase userDataBase = new UserDataBase();

        Response loginResult = new RegistrationController(userDataBase).createUser("testUser1", "passw1");

        Assert.assertEquals(true, loginResult.isSuccess());
        Assert.assertEquals(true, userDataBase.checkUser("testUser1"));


    }  @Test
    public void shouldNotCreateNewUser() {
        UserDataBase userDataBase = new UserDataBase();

        Response loginResult = new RegistrationController(userDataBase).createUser("testUser1", "ss");

        Assert.assertEquals(false, loginResult.isSuccess());


    }

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



