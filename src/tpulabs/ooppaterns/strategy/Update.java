package tpulabs.ooppaterns.strategy;

public class Update implements ComponentState {
    private final String COMPONENT_STATE = "Updating";

    @Override
    public void doComponentActivity() {
        System.out.println(this.COMPONENT_STATE);
    }
}
