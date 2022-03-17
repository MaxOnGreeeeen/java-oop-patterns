package tpulabs.ooppaterns.abstractfactory.editnotemodal;

import tpulabs.ooppaterns.abstractfactory.DescriptionInput;
import tpulabs.ooppaterns.abstractfactory.ModalWindow;
import tpulabs.ooppaterns.abstractfactory.SubmitButton;
import tpulabs.ooppaterns.abstractfactory.TitleInput;

public class EditNoteModal implements ModalWindow {

    @Override
    public TitleInput getTitleInput() {
        return new TitleChangeInput();
    }

    @Override
    public DescriptionInput getDescriptionInput() {
        return new DescriptionChangeInput();
    }

    @Override
    public SubmitButton getSubmitButton() {
        return new SubmitSaveChanges();
    }
}
