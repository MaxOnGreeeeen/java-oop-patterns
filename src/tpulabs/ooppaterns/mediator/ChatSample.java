package tpulabs.ooppaterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatSample implements Chat{
    private User admin;
    List<User> users = new ArrayList<>();

    public void setChatAdmin(User user){
        this.admin = user;
    }

    public void addUserToChat(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User userRecieve: users){
            if(userRecieve != user){
                userRecieve.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
