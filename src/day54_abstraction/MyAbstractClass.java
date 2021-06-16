package day54_abstraction;

public abstract class MyAbstractClass {
    int num = 55;
    public void learn (){
        System.out.println("Learning...");
    }

    public abstract void close(); //-> method with no implementation, just a signiture
}

class Sub extends MyAbstractClass{ //responsible to provide for 'close' abstract method's behavior
    //must override/implement close()
    public void close(){
        System.out.println("close abstract method implementation");
    }

}

class MyObjects{
    public static void main(String[] args) {
        //MyAbstractClass mac = new MyAbstractClass();
        Sub sub = new Sub();
        sub.learn();
        System.out.println(sub.num);

        sub.close();

    }
}
