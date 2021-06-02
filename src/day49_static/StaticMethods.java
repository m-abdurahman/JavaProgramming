package day49_static;

public class StaticMethods {

    int num = 10; //NON-STATIC METHOD, instance variable
   static int count = 5; //allows to be access under displayMessage method since its static also


    public static void displayMessage(String message){
        System.out.println("message: " + message);
        //System.out.println("num = " + num); //ERROR: NON-STATIC, & can't access the method sine its under the static method
        System.out.println("count = " + count); //count was inside the static method hence it can be referred
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }
    //NEEDS TO CREATE OBJECTS
    //StaticMethods.instanceMethod(); >no
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num = " + num); //num is able to be able called here since its under non-static method
        System.out.println("count = " + count);
        System.out.println("hello from instance class");
    }
}
