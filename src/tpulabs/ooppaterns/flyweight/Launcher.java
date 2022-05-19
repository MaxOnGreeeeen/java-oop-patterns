package tpulabs.ooppaterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args){
        ButtonsFactory buttonsFactory = new ButtonsFactory();

        List<Button> buttonList = new ArrayList<>();

        buttonList.add(buttonsFactory.getButtonByProps(ButtonProps.CREATE));
        buttonList.add(buttonsFactory.getButtonByProps(ButtonProps.CREATE));
        buttonList.add(buttonsFactory.getButtonByProps(ButtonProps.CREATE));
        buttonList.add(buttonsFactory.getButtonByProps(ButtonProps.CREATE));

        buttonList.add(buttonsFactory.getButtonByProps(ButtonProps.SUBMIT));
        buttonList.add(buttonsFactory.getButtonByProps(ButtonProps.SUBMIT));
        buttonList.add(buttonsFactory.getButtonByProps(ButtonProps.SUBMIT));
        buttonList.add(buttonsFactory.getButtonByProps(ButtonProps.SUBMIT));

        for(Button button: buttonList){
            button.getProps();
        }
    }
}
