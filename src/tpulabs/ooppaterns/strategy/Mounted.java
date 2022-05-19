package tpulabs.ooppaterns.strategy;

public class Mounted implements ComponentState {
    private final String COMPONENT_STATE = "Mounting";

    @Override
    public void doComponentActivity() {
        System.out.println(this.COMPONENT_STATE);
    }
}
