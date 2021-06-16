package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put toppings and cheese");

    }

    @Override
    public void serve() {
        System.out.println("serve by slicing and placing it in a box");

    }
}
