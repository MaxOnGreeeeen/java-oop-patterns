package tpulabs.ooppaterns.factorymethod;

public class SubNote extends SimpleNote implements Note{
    private String TYPE;
    private String title;
    private String description;
    private SimpleNote parrentNote;

    public SubNote(String title, String description, String TYPE) {
        super(title, description, TYPE);
    }

    public void setParentNote(SimpleNote parrentNote){
        this.parrentNote = parrentNote;
    }
    @Override
    public void getNote() {
        super.getNote();
    }
}
