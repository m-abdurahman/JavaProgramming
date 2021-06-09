package day51_inheritance;

public class Contractor extends Employee{
    @Override //1. lets others know you're overriding
              //2. Ensures that this method is being overridden
    public double calculatorSalary(double hourlyRate){
        Double annualRate = (50 * 40 * hourlyRate);
        return annualRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
