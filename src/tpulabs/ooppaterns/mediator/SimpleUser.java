package tpulabs.ooppaterns.mediator;

public class SimpleUser extends UserSystem implements User{
    private final Chat chat;

    public SimpleUser(Chat chat, String firstName, String secondName) {
        super(firstName, secondName);
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.getFirstName() + " getting message: " + message + ".");
    }
}
