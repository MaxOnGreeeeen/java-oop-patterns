package tpulabs.ooppaterns.singletone;

public class CommonChat {
    private static CommonChat commonChat;
    private static String chatText = "Welcome to chat!" + "\n";

    public static synchronized CommonChat getCommonChat(){
        if (commonChat == null){
            commonChat = new CommonChat();
        }
        return commonChat;
    }

    private CommonChat(){

    }

    public void writeToChat(User user, String chatMessage){
        String userInfo =  user.getFirstName().toString() + " " +
                user.getSecondName().toString() + ": ";
        chatText += userInfo + chatMessage + "\n";
    }

    public void showChat(){
        System.out.println(chatText);
    }
}

