package day45_OOP;

public class TrafficLight {
    String color;

    //these are read only method,only displaying values of color variable
    public void showColor(){
        System.out.println("current color = " + color);
    }

    public void changeColor(String newColor){
        if(newColor.equals("red") || newColor.equals("yellow")
        || newColor.equals("green")) {

            System.out.println("changing color to " + newColor);
            color = newColor;
        }else{
            System.out.println("ERROR: invalid color: " + newColor);
        }

    }

}
