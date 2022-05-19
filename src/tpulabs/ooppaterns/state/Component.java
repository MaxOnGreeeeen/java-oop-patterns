package tpulabs.ooppaterns.state;


enum ComponentStatesVariant{
    MOUNTED("onComponentMount"), UPDATE("onComponentUpdate"), UNMOUNTED("onComponentUnmount");

    private final String functionName;

    ComponentStatesVariant(String functionName) {
        this.functionName = functionName;
    }
}

public class Component {
    ComponentState componentState;
    private ComponentStatesVariant stateName;

    public Component(){
        setComponentState(new Mounted(), ComponentStatesVariant.MOUNTED);
    }

    public void setComponentState(ComponentState componentState, ComponentStatesVariant stateName){
        this.componentState = componentState;
        this.stateName = stateName;
    }

    public void next() {
        switch (stateName) {
            case MOUNTED:
                setComponentState(new Update(), ComponentStatesVariant.UPDATE);
                break;
            case UPDATE:
                setComponentState(new Unmounted(), ComponentStatesVariant.UNMOUNTED);
                break;
            case UNMOUNTED:
                setComponentState(new Mounted(), ComponentStatesVariant.MOUNTED);
                break;
            default:
                break;
        }
    }

    public void doActivity(){
        componentState.doComponentActivity();
    }
}
