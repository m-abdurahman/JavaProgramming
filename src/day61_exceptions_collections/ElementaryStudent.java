package day61_exceptions_collections;

import java.security.PublicKey;

public class ElementaryStudent {
    //-> name, age
    //-> encapsulate the data.
    //
    //in the setter classes:
    //    setName(String name) :
    //        if name is empty
    //            throw illegalArgument Exception
    //                with message: "Name cannot be empty"
    //        else
    //            this.name = name;
    //
    //    setAge(int age)
    //        if age is < 5 or more than 12
    //            throw new illegalArgumentException
    //                with message: Age cannot be < 5 or > 12
    //        else
    //            this.age = age

    private String name;
    private int age;

    public ElementaryStudent(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public ElementaryStudent() {

    }

    @Override
    public String toString(){
        return "ElementaryStudent{" +
                "name ='" + name + '\'' +
                ", age= " + age ;
    }

    public void setName(String name){
        //check if name is null first, otherwise, we might get null pointer exception
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }else{ //if name is all numbers, or starts with number
            this.name = name;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age <5 || age >12) {
            throw new IllegalArgumentException("Age cannot be <5 or >12");
        }else{
            this.age = age;
        }
    }

}


