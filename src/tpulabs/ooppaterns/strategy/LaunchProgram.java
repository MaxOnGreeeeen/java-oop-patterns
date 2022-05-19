package tpulabs.ooppaterns.strategy;

public class LaunchProgram {
    public static void main(String[] args){
        //Mounting component
        Component component = new Component();
        component.setComponentState(new Mounted());
        component.doActivity();

        component.setComponentState(new Update());
        component.doActivity();

        component.setComponentState(new Unmounted());
        component.doActivity();
    }
}
