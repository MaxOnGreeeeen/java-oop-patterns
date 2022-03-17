package tpulabs.ooppaterns.abstractfactory;

import tpulabs.ooppaterns.abstractfactory.createnotemodal.CreateNoteModal;

public class CreateModal {
    public void createNoteModal(){
        ModalWindow modalWindow = new CreateNoteModal();

        TitleInput titleInput = modalWindow.getTitleInput();
        DescriptionInput descriptionInput = modalWindow.getDescriptionInput();
        SubmitButton submitButton = modalWindow.getSubmitButton();

        System.out.println("Create modal has been created " + "\n");

        titleInput.changeTitle();
        descriptionInput.changeDescription();
        submitButton.submitChanges();
    }
}
