package tpulabs.ooppaterns.proxy;

public class AuthorizeUser implements Authorization {
    private String userName;
    private String password;

    public AuthorizeUser(String userName, String password){
        this.userName = userName;
        this.password = password;

        verifyData();
    }

    public void verifyData(){
        System.out.println("Verifying data...");
    }

    @Override
    public void authorize() {
        System.out.println("User is authorized ");
    }
}
