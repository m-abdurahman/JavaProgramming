package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        //String firstName, lastName;
        //int id, batchNum, phoneNum;

        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";
        String [] student2 = {"1234" , "Miya", "Abdurahman", "B22", "703-123-4567"};

        System.out.println("Student ID = " + student2[0]);
        System.out.println("Student first name = " + student2[1]);
        System.out.println("Student last name = " + student2[2]);
        System.out.println("Student batch number = " + student2[3]);
        System.out.println("Student mobile number = " + student2[4]);

        System.out.println("Student data length: " + student2.length);

        if (student2.length ==5) {
            System.out.println("PASS: data array has correct length");
        }else{
            System.out.println("FAIL: data array has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("PASS: data array length match");
        }else{
            System.out.println("FAIL: data array length mismatch");
        }

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNum =student1[4]; //storing into string from string array
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));


    }
}
