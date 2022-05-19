package tpulabs.ooppaterns.state;

public class LaunchProgram {
    public static void main(String[] args){
        //Mounting component
        Component component = new Component();
        component.doActivity();

        //Updating component
        component.next();
        component.doActivity();

        //Unmounting component
        component.next();
        component.doActivity();
    }
}
