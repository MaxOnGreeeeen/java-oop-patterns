package tpulabs.ooppaterns.factorymethod;

public class Main {
    public static void main (String[] args) throws NoteNameException {
        NoteFactory noteFactory = createNoteByName("simple");
        Note note = noteFactory.createNote("title", "description", "Простая заметка");

        note.getNote();

        NoteFactory noteFactory1 = createNoteByName("sub");
        Note note1 = noteFactory1.createNote("title1", "description1", "Подзаметка");

        note1.getNote();
    }

    public static NoteFactory createNoteByName(String noteName) throws NoteNameException {
        if (noteName.equalsIgnoreCase("sub")){
            System.out.println();
            return new SubNoteFactory();
        }
        if (noteName.equalsIgnoreCase("simple")){
            System.out.println();
            return new SimpleNoteFactory();
        }
        else{
            throw new NoteNameException("Name is incorrect");
        }
    }
}
