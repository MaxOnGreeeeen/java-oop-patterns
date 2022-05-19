package tpulabs.ooppaterns.factorymethod;

public class SimpleNoteFactory implements NoteFactory{

    @Override
    public Note createNote(String title, String description, String TYPE) {
        return new SimpleNote(title, description, TYPE);
    }
}
