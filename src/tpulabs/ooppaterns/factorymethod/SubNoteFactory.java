package tpulabs.ooppaterns.factorymethod;

public class SubNoteFactory implements NoteFactory{
    @Override
    public Note createNote(String title, String description, String TYPE) {
        return new SubNote(title, description, TYPE);
    }
}
