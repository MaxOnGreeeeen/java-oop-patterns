package tpulabs.ooppaterns.abstractfactory;

import tpulabs.ooppaterns.abstractfactory.editnotemodal.EditNoteModal;

public class EditModal {
    public void createEditModal(){
        ModalWindow modalWindow = new EditNoteModal();

        TitleInput titleInput = modalWindow.getTitleInput();
        DescriptionInput descriptionInput = modalWindow.getDescriptionInput();
        SubmitButton submitButton = modalWindow.getSubmitButton();

        System.out.println("Edit modal has been created " + "\n");

        titleInput.changeTitle();
        descriptionInput.changeDescription();
        submitButton.submitChanges();
    }

}
