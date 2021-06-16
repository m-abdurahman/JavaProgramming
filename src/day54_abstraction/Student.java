package day54_abstraction;

public abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }


    public abstract void attendClass();
}


  class onlineStudent extends Student{   //attendClass abstract method is implemented by the subclass
    @Override   //subclass is overriding the abstract method of parent class Student
    public void attendClass(){
        System.out.println("Online student attending the class using Zoom");

    }
}

 class School{
    public static void main(String[] args) {
        onlineStudent st1 = new onlineStudent();
        st1.attendClass();
        st1.code("java");

        
    }
}
