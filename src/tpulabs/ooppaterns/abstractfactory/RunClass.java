package tpulabs.ooppaterns.abstractfactory;

public class RunClass {
    public static void main(String[] args){
        EditModal editModal = new EditModal();
        editModal.createEditModal();

        CreateModal createModal = new CreateModal();
        createModal.createNoteModal();
    }

}
