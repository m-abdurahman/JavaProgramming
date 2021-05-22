package day20_string_manipulation;

public class StringIsEmpty {
    public static void main (String[] args){
        String job = "";

        System.out.println(job.length()==0);
        System.out.println(job.equals(""));
        System.out.println(job.isEmpty());

        if (job.isEmpty()) {
            System.out.println("Job title is empty. Please respond");
        }else{
            System.out.println("Job title looks good");
        }

        if(job.length() == 0) {
            System.out.println("Job title is empty");
        }else{
            System.out.println("Job title is not empty");
        }

        System.out.println(job.equals(""));

        if("".equals(job)) {
            System.out.println("Job title is empty");
        }else{
            System.out.println("Job title is not empty");
        }

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());

        if (!veggie.isEmpty()) {
            System.out.println("We have carrots");
        }



    }
}
