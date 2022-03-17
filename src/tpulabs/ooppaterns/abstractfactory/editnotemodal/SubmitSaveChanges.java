package tpulabs.ooppaterns.abstractfactory.editnotemodal;

import tpulabs.ooppaterns.abstractfactory.SubmitButton;

public class SubmitSaveChanges implements SubmitButton {
    @Override
    public void submitChanges() {
        System.out.println("Save changes");
    }
}
