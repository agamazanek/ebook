package pl.sda.ebook.UserData;

import java.util.ArrayList;
import java.util.HashMap;

public class UserDataBase {

        HashMap <String, String> users = new HashMap<String, String>();



    public void addUser(String login, String passwd) {

        users.put(login, passwd);

    }


    public boolean checkUser(String login) {
        if(users.containsKey(login)){
            return true;
        } else {
            return false;
        }
    }
}
