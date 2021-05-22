package day45_OOP;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();

        //call method to access variable
        trafficLight.changeColor("green");

        trafficLight.showColor();

        TrafficLight trafficlight2 = new TrafficLight();
        trafficlight2.changeColor("brown");
        trafficlight2.showColor();

    }
}
