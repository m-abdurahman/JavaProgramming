package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in the parking lot = " + cars);
        cars +=5;
        System.out.println("cars in the parking lot = " + cars);
        cars -=6;
        System.out.println("cars in the parking lot= " + cars);
        cars -= 1;
        System.out.println("cars in the parking lot= " + cars);

        int electricCars = 13;
        System.out.println("cars in the parking lot = " + cars);

        //shorthand from above
        cars += electricCars;
        System.out.println("cars in the parking lot = " + cars);
        
        String word = "java";
        System.out.println("word = " + word);

        word = word + " programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun";
        word += selenium;
        System.out.println(word + selenium);

        word +=12345;
        System.out.println("word = " + word);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter +=3; //ASCII table conversion
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parkingFee = " + parkingFee);
        // early bird parking fee is 50% 0ff
        parkingFee /=2;
        System.out.println("parkingFee for early bird= " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("Weekend parking fee = " + parkingFee);
    }
}
