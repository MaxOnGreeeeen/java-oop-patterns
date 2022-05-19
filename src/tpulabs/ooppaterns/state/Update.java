package tpulabs.ooppaterns.state;

public class Update implements ComponentState{
    private final String COMPONENT_STATE = "Updating";

    @Override
    public void doComponentActivity() {
        System.out.println(this.COMPONENT_STATE);
    }
}
