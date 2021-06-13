package day53_inhertance.hiding;

public class Mobile extends Phone{
    String type = "Mobile phone";
    /**
    *Method hiding
     * We are hiding use() static method
     */
    public static void use(){
        System.out.println("Using mobile phone");
    }

    public void text(){
        use();
        System.out.println("and sending a text message");
    }

    @Override
    public void call(){
        use();
        System.out.println("and calling on mobile");
}}
