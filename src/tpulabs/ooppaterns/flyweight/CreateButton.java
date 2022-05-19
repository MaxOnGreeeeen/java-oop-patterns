package tpulabs.ooppaterns.flyweight;

public class CreateButton implements Button{
    private final ButtonProps buttonProps = ButtonProps.CREATE;

    @Override
    public void getProps() {
        System.out.println("Название - " +  buttonProps.getName() + "\n"
                + "Метод - " + buttonProps.getFunction() + "\n");
    }
}
