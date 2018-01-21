package pl.sda.ebook.UserData;

import java.util.ArrayList;
import java.util.HashMap;

public class UserDataBase {

    private HashMap <String, User> users = new HashMap<String, User>();


    public boolean checkUser(String login) {
        return users.containsKey(login);
    }

    public void addUser(User user) {
        users.put(user.getLogin(), user);
    }
}
