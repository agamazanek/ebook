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
    public void shouldCreateNewUser() {
        UserDataBase userDataBase = new UserDataBase();

        Response loginResult = new RegistrationController(userDataBase).createUser("testUser1", "passw1");

        Assert.assertEquals(true, loginResult.isSuccess());
        Assert.assertEquals(true, userDataBase.checkUser("testUser1"));
    }

    @Test
    public void shouldNotCreateNewUserWhenTooShortPasswordGiven() {
        UserDataBase userDataBase = new UserDataBase();

        Response loginResult = new RegistrationController(userDataBase).createUser("testUser1", "ss");

        Assert.assertEquals(false, loginResult.isSuccess());
        Assert.assertEquals("Password too short", loginResult.getMessage());
        Assert.assertEquals(false, userDataBase.checkUser("testUser1"));
    }

    @Test
    public void shouldNotCreateNewUserWhenUserAlreadyExist() {
        UserDataBase userDataBase = new UserDataBase();
        User user2 = new User("testUser1", "pass");
        userDataBase.addUser(user2);
        Response loginResult = new RegistrationController(userDataBase).createUser("testUser1", "pass");

        Assert.assertEquals(false, loginResult.isSuccess());
        Assert.assertEquals("User already exists", loginResult.getMessage());
    }

}



