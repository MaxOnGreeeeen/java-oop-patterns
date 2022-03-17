package tpulabs.ooppaterns.factorymethod;

public interface NoteFactory {
    public Note createNote(String title, String description);
    public Note createNote(String title, String description, SimpleNote simpleNote);
}
