package tpulabs.ooppaterns.proxy;

public class RunProject {

    public static void main(String[] args){
        ProxyAuthorizeUser proxyAuthorizeUser = new ProxyAuthorizeUser("maksim", "12345");
        proxyAuthorizeUser.authorize();
    }

}
