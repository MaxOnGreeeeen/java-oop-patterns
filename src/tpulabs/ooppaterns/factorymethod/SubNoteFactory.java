package tpulabs.ooppaterns.factorymethod;

public class SubNoteFactory implements NoteFactory{
    @Override
    public Note createNote(String title, String description) {
        return new SubNote(title, description);
    }

    @Override
    public Note createNote(String title, String description, SimpleNote simpleNote) {
        return new SubNote(title, description, simpleNote);
    }
}
