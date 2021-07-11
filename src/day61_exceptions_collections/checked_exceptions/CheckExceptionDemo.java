package day61_exceptions_collections.checked_exceptions;

public class CheckExceptionDemo {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("About to sleep for 10 seconds");
        /** 1.
         * Thread.sleep(1000); causes/throws a checked InterruptedException
         * which is a child of Exception class (aka checked exception)
         * We are HANDLING it below using try-catch
         */
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace(); //only prints when exception happens
        }

        /** 2.
         * DECLARING using 'throws' keyword in the main method like "extension"
         */
        Thread.sleep(5000);

        System.out.println("Woke up after 10 seconds");
    }
}
