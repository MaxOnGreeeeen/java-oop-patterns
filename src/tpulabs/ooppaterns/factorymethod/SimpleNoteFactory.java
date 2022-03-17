package tpulabs.ooppaterns.factorymethod;

public class SimpleNoteFactory implements NoteFactory{

    @Override
    public Note createNote(String title, String description) {
        return new SimpleNote(title, description);
    }

    @Override
    public Note createNote(String title, String description, SimpleNote simpleNote) {
        return null;
    }
}
