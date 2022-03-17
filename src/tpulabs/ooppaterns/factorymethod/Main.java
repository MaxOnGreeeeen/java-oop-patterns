package tpulabs.ooppaterns.factorymethod;

public class Main {
    public static void main (String[] args) throws NoteNameException {
        NoteFactory noteFactory = createNoteByName("simple");
        Note note = noteFactory.createNote("title", "description");

        note.getNote();

        NoteFactory noteFactory1 = createNoteByName("sub");
        Note note1 = noteFactory.createNote("title1", "description1");

        note1.getNote();
    }

    public static NoteFactory createNoteByName(String noteName) throws NoteNameException {
        if (noteName.equalsIgnoreCase("sub")){
            return new SubNoteFactory();
        }
        if (noteName.equalsIgnoreCase("simple")){
            return new SimpleNoteFactory();
        }
        else{
            throw new NoteNameException("Name is incorrect");
        }
    }
}
