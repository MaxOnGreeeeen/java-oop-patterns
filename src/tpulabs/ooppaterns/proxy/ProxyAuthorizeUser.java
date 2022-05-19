package tpulabs.ooppaterns.proxy;

public class ProxyAuthorizeUser implements Authorization {
    private String userName;
    private String password;
    private AuthorizeUser authorizeUser;


    public ProxyAuthorizeUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void authorize() {
        if(authorizeUser == null){
            authorizeUser = new AuthorizeUser(userName, password);
        }

        authorizeUser.authorize();
    }
}
