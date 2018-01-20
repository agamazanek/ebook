package pl.sda.ebook.Registration;

import UserData.User;
import UserData.UserDataBase;

import java.util.ArrayList;

public class RegistrationController {
    private final UserDataBase userDataBase = new UserDataBase();

    public Response createUser(String testUser1, String passw1) {

        Response response = new Response();
        if(passw1.length() < 3){
            response.setMessage("Password too short");
            response.setUserCreated(false);
            return response;
        } else {
            User user=new User(testUser1,passw1) ;
            userDataBase.add(user);
            response.setMessage("user created");
            response.setUserCreated(true);
            return response;
        }
    }


}
