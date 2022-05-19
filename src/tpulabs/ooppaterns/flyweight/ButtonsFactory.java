package tpulabs.ooppaterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ButtonsFactory {
    private static final Map<ButtonProps, Button> buttons = new HashMap<>();

    public Button getButtonByProps(ButtonProps props){
        Button button = buttons.get(props);

        if( button == null){
            switch (props){
                case CREATE:
                    button = new CreateButton();
                    System.out.println("Created create button");
                    break;
                case SUBMIT:
                    button = new SubmitButton();
                    System.out.println("Created submit");
                    break;

                default:
                    break;
            }
            buttons.put(props, button);
        }

        return button;
    }
}
