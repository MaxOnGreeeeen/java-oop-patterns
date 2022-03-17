package tpulabs.ooppaterns.abstractfactory.editnotemodal;

import tpulabs.ooppaterns.abstractfactory.DescriptionInput;

public class DescriptionChangeInput implements DescriptionInput {
    private String descriptionValue = "initial description value";

    public void setDescriptionValue(String descriptionValue) {
        this.descriptionValue = descriptionValue;
    }

    @Override
    public void changeDescription() {
        System.out.println(descriptionValue);
    }
}
