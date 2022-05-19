package tpulabs.ooppaterns.state;

public class Unmounted implements ComponentState{
    private final String COMPONENT_STATE = "Unmounting";

    @Override
    public void doComponentActivity() {
        System.out.println(this.COMPONENT_STATE);
    }
}
