package tpulabs.ooppaterns.factorymethod;

public interface NoteFactory {
    public Note createNote(String title, String description, String TYPE);
}
