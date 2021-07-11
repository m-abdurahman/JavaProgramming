package day60_exceptions;

public class ThrowingException {
    //manually creating an exception/problem
    public static void main(String[] args) {
        System.out.println("Let's create exceptions");
        RuntimeException e = new RuntimeException();
        throw e;
        //or
        //throw new RuntimeException();
    }
}
