package day57_abstraction_polymorphism.polymorphism;


import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal(); //NOT polymorphic, data type & object type is same
        a1.makeNoise();

        //Polymorphic way
        //parent type = new child type

        //variable of list data types is parents class & objects are any of the sub classes
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal animal3 = new Cat();
        //List list = new ArrayList(); -> also polymorphic

        animal1.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();

        //polymorphic lists of objects
        //objects are any of child classes
        //variable of list data types is parents class & objects are any of the sub classes

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for (Animal each: listOfAnimals){
            each.makeNoise();
        }


    }
}

