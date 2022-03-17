package tpulabs.ooppaterns.abstractfactory;

public interface ModalWindow {
    TitleInput getTitleInput();
    DescriptionInput getDescriptionInput();
    SubmitButton getSubmitButton();
}
