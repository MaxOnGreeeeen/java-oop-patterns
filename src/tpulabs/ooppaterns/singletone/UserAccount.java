package tpulabs.ooppaterns.singletone;

public class UserAccount implements UserInterface{
    private String email;
    private String password;
    private boolean authorizationStatus;
    private boolean registerStatus;

    public void setAuthorizationStatus(boolean authorizationStatus) {
       this.authorizationStatus = authorizationStatus;
    }

    public void setRegisterStatus(boolean registerStatus) {
        this.registerStatus = registerStatus;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void displayUserAccount() {
        System.out.println("email: " + this.email + "\n" +
                "password: " + this.password);
    }

    @Override
    public void createUserAccount(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    @Override
    public void changeUserData(String email, String password) {
        setEmail(email);
        setPassword(password);
    }
}
