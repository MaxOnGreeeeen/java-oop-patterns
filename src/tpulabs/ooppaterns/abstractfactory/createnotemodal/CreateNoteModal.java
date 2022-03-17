package tpulabs.ooppaterns.abstractfactory.createnotemodal;

import tpulabs.ooppaterns.abstractfactory.DescriptionInput;
import tpulabs.ooppaterns.abstractfactory.ModalWindow;
import tpulabs.ooppaterns.abstractfactory.SubmitButton;
import tpulabs.ooppaterns.abstractfactory.TitleInput;

public class CreateNoteModal implements ModalWindow {

    @Override
    public TitleInput getTitleInput() {
        return new TitleInitInput();
    }

    @Override
    public DescriptionInput getDescriptionInput() {
        return new DescriptionInitInput();
    }

    @Override
    public SubmitButton getSubmitButton() {
        return new CreateNoteButton();
    }
}
