package pl.sda.ebook.Registration;

public class RegistrationController {
    public Response createUser(String testUser1, String passw1) {

        Response response = new Response();
        response.setMessage("user created");
        response.setUserCreated(true);
        return response;
    }


}
