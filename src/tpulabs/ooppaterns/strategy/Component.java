package tpulabs.ooppaterns.strategy;

public class Component {
    ComponentState componentState;

    public void setComponentState(ComponentState componentState){
        this.componentState = componentState;
    }

    public void doActivity(){
        componentState.doComponentActivity();
    }
}
