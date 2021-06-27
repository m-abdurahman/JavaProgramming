package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        /**
         * single variable of parent type,
         * and different objects of child type
         */
        Shape shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();

        /**
         * create a list of shapes and stores 10 different shapes
         */

        List<Shape> shapes = new ArrayList<>(); //ArrayList is child class of List
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());

        //System.out.println(shapes); -> hash code, didn't override, needs loops

        for (Shape eachShape: shapes){
            eachShape.draw();

        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);

    }

    /**
     * static method: drawShape
     * accepts object of shape
     * then calls draw() method
     */
    public static void drawShape(Shape shape){
        System.out.println("----Drawing shape----");
        shape.draw();
    }

}
