package pl.sda.ebook.Registration;

public class Response {
    boolean isUserCreated;
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public boolean isUserCreated() {
        return isUserCreated;
    }

    public void setUserCreated(boolean userCreated) {
        isUserCreated = userCreated;
    }

    public boolean isSuccess(){

            return isUserCreated();
    }
}
