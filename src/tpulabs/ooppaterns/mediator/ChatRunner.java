package tpulabs.ooppaterns.mediator;

public class ChatRunner {
    public static void main(String[] args){
        ChatSample chatSample = new ChatSample();
        User chatAdmin = new AdminUser(chatSample, "Admin", "Adminov");
        User simpleUser1 = new SimpleUser(chatSample, "Максим", "Андреев");
        User simpleUser2 = new SimpleUser(chatSample, "Андрей", "Максимов");

        chatSample.setChatAdmin(chatAdmin);
        chatSample.addUserToChat(simpleUser1);
        chatSample.addUserToChat(simpleUser2);

        simpleUser1.sendMessage("Привет, пользователь 1");
    }
}
