package pl.sda.ebook.Registration;

import pl.sda.ebook.UserData.User;
import pl.sda.ebook.UserData.UserDataBase;

public class RegistrationController {

    private UserDataBase userDataBase;

    public RegistrationController(UserDataBase userDataBase) {
        this.userDataBase = userDataBase;
    }

    public Response createUser(String testUser1, String passw1) {

        Response response = new Response();
        if (passw1.length() < 3) {
            response.setMessage("Password too short");
            response.setUserCreated(false);
            return response;
        } else {
            User user = new User(testUser1, passw1);
            userDataBase.addUser(testUser1, passw1);
            response.setMessage("user created");
            response.setUserCreated(true);
            return response;
        }
    }


}
