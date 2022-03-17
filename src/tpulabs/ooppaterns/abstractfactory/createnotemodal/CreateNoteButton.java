package tpulabs.ooppaterns.abstractfactory.createnotemodal;

import tpulabs.ooppaterns.abstractfactory.SubmitButton;

public class CreateNoteButton implements SubmitButton {

    @Override
    public void submitChanges() {
        System.out.println("Note has been created");
    }
}
