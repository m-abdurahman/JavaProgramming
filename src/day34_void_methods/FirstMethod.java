package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage(); //call the message
        displayMessage();

        for (int i=0; i>=0; i++){
            System.out.println(i + "-");
            displayMessage();
        }

    }
    //first custom re-usable method
    public static void displayMessage(){
        System.out.println("Hello b22 friends!");

    }

}
