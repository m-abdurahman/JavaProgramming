package day51_inheritance;

public class Employee extends Object{
    String jobTitle;

    public double calculatorSalary(double hourlyRate){
        double annualSalary = ((40 *52*hourlyRate)*1.1);
        return annualSalary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }




}
