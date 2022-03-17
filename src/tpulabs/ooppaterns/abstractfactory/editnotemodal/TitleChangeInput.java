package tpulabs.ooppaterns.abstractfactory.editnotemodal;

import tpulabs.ooppaterns.abstractfactory.TitleInput;

public class TitleChangeInput implements TitleInput {
    private String titleValue = "Initial title value";

    public void setDescriptionValue(String descriptionValue) {
        this.titleValue = descriptionValue;
    }

    @Override
    public void changeTitle() {
        System.out.println(titleValue);
    }
}
