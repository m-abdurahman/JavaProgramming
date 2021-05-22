package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "Etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("----- Starting deployment of Etsy app to AWS zone -----");

        String [] zoneToDeploy = zones.split(",");
        for (String eachZone : zoneToDeploy) {
            System.out.println("Deploying " + app + " to " + eachZone + "....");
            System.out.println("Deployment completed for " + eachZone);

        }
        System.out.println("------ All deployment complete -----");


    }

}
