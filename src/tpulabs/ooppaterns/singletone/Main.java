package tpulabs.ooppaterns.singletone;

public class Main {

    public static void main(String[] args) {
        String name = "Максим", secondName = "Садиков",
        email = "maksim@gmail.com", password = "maksim111";

        String name2 = "Андрей", secondName2 = "Козлов",
                email2 = "andrey@gmail.com", password2 = "andrey111";

        User user = new User(name, secondName);
        User user2 = new User(name2, secondName2);

        user.createUserAccount(email, password);
        user2.createUserAccount(email2, password2);


        //Write a message
        CommonChat.getCommonChat().writeToChat(user, "Всем привет");
        CommonChat.getCommonChat().showChat();

        CommonChat.getCommonChat().writeToChat(user2, "И тебе привет");
        CommonChat.getCommonChat().showChat();

    }
}
