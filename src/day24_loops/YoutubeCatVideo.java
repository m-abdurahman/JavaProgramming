package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        double seconds = 0.0;
        while (seconds <=117){
            System.out.println("Watching Youtube video: " + seconds);
            ++seconds;
        }
        System.out.println("Finished watching cat video, let's start another one");

        int count = 5;
        while (count >=0){
            System.out.println("count= " + count);
            count--;
        }
        System.out.println("Finished counting");

        int unreadSMS = 10;
        System.out.println("I have total of " + unreadSMS + " unread SM messages");
        while (unreadSMS >=0) {
            System.out.println("Total unread SMS messages= " + unreadSMS);
            --unreadSMS;
        }
        System.out.println("Finished reading all SMS");
    }
}
