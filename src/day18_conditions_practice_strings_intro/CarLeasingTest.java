package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        char model ='A';
        int leasePrice = 500;

        if (make.equals("Mercedes")){
            if(model =='E'){
            leasePrice = 500;
        }else if (model =='A') {
                leasePrice = 400;
            }
        }else{
                System.out.println("Invalid search");
            }

            System.out.println("make= " + make);
            System.out.println("model = " + model);
            System.out.println("leasing price= "+ leasePrice);


        }





    }

