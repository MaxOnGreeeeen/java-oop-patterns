package tpulabs.ooppaterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class SimpleNote implements Note{
    private String title;
    private String description;

    public SimpleNote(String title, String description) {
        this.title = title;
        this.description = description;
    }

    private List<SubNote> subNotes = new ArrayList<>();

    public void addNewNote(SubNote note){
        subNotes.add(note);
    }

    @Override
    public void getNote(){
        System.out.println("Title: " + this.title + "\n" + "Description: " +
                this.description);
    }
}
