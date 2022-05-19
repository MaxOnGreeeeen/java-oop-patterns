package tpulabs.ooppaterns.flyweight;

public enum ButtonProps {
    SUBMIT("Submit", "onSubmit"),
    CREATE("Create","onCreate");

    private String name;
    private String function;

    ButtonProps(String name, String function) {
        this.name = name;
        this.function = function;
    }

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }
}
