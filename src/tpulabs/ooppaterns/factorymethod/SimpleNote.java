package tpulabs.ooppaterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class SimpleNote implements Note{
    private  String TYPE;
    private String title;
    private String description;

    public SimpleNote(String title, String description, String TYPE) {
        this.title = title;
        this.description = description;
        this.TYPE = TYPE;
    }

    private List<SubNote> subNotes = new ArrayList<>();

    public void addNewNote(SubNote note){
        subNotes.add(note);
    }

    @Override
    public void getNote(){
        System.out.println(this.TYPE + "\n");
        System.out.println("Title: " + this.title + "\n" + "Description: " +
                this.description);

    }
}
