package day05_primitives_concatanation;

public class JobInfo {
    public static void main (String [] args){
        String title= "Java Developer";
        String company= "Palo Alto Networks";
        String jobDescription= "Develop codes using java programming language";
        double salary= 85000;
        byte yearsExperience= 3;
        boolean doesItHaveBenefits= true;

        System.out.println("Job Title: " + title);
        System.out.println("Company name: " + company);
        System.out.println("Job Description: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Years Experience: " + yearsExperience);
        System.out.println("Benefits: " + doesItHaveBenefits);


    }
}
