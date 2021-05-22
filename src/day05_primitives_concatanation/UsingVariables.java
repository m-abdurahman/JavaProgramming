package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int num1= 100;
        int num2= num1;
        System.out.println(num1); //prints 100
        System.out.println(num2); //prints 100

        num1= 200;
        System.out.println(num1); //prints 200
        System.out.println(num2); //prints 200

        int n1=55; //value 55
        int n2=n1; //value 55
        int n3=n2; //value 55

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inthirasZipCode= 22182;
        int parvinsZipCode= inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);

        inthirasZipCode= 20007;
        parvinsZipCode= 33131;
        System.out.println(inthirasZipCode); //prints 2007
        System.out.println(parvinsZipCode); //prints 33131






    }
}
