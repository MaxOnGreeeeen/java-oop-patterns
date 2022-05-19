package tpulabs.ooppaterns.flyweight;

public class SubmitButton implements Button{
    private final ButtonProps buttonProps = ButtonProps.SUBMIT;

    @Override
    public void getProps() {
        System.out.println("Название - " +  buttonProps.getName() + "\n"
        + "Метод - " + buttonProps.getFunction() + "\n");
    }
}
