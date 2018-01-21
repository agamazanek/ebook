package pl.sda.ebook.UserData;

public class User {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public User(String login, String password) {
        this.login = login;

        this.password = password;
    }


}
