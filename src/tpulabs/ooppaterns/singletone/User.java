package tpulabs.ooppaterns.singletone;

public class User implements UserInterface{
    private final String firstName;
    private final String secondName;
    private final UserAccount userAccount = new UserAccount();

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public User(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public void createUserAccount(String email, String password) {
        this.userAccount.setEmail(email);
        this.userAccount.setPassword(password);
    }

    @Override
    public void changeUserData(String email, String password) {
        userAccount.setEmail(email);
        userAccount.setPassword(password);
    }

    public void getUserInfo(){
        System.out.println("User name: " + firstName + "\n" +
                "User second name: " + secondName + "\n");

        System.out.println("Данные аккаунта: ");

        userAccount.displayUserAccount();
    }
}
