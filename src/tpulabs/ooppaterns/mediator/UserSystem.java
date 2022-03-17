package tpulabs.ooppaterns.mediator;

public class UserSystem {
    private final String firstName;
    private final String secondName;

    public UserSystem(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void getUserInfo(){
        System.out.println("User name: " + firstName + "\n" +
                "User second name: " + secondName + "\n");

        System.out.println("Данные аккаунта: ");
    }
}
