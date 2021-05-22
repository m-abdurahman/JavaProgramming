package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        continues();

    }
    public static void start (){
        System.out.println("start");
        continues();
    }
    public static void continues() {
        end();
        System.out.println("continue");
    }
    public static void end() {
        System.out.println("end");
    }


    }


