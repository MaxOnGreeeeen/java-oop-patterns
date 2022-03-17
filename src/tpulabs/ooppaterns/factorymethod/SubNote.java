package tpulabs.ooppaterns.factorymethod;

public class SubNote extends SimpleNote implements Note{
    private String title;
    private String description;
    private SimpleNote parrentNote;

    public SubNote(String title, String description, SimpleNote simpleNote) {
        super(title, description);
    }

    public SubNote(String title, String description) {
        super(title, description);
    }

    public void setParentNote(SimpleNote parrentNote){
        this.parrentNote = parrentNote;
    }
    @Override
    public void getNote() {
        System.out.println("Title: " + this.title + "\n" + "Description: " +
                this.description);
    }
}
