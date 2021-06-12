package day50_inheritance.overriding;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "vertebrae";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();


        Dog dog = new Dog();
        dog.speak();

        //ONLY WILL PRINT THE SPEAKING METHOD
        //(that was inherited from the animal superclass)
        // X3 SINCE THERE ARE 3 CLASSES
    }
}
