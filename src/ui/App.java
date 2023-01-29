package ui;

import model.Car;
import model.Wheel;
import model.Engine;

public class App {
    public static void main(String[] args) {

        // Todo list

        // + 1. Create structure using two packages
        // + 2. Create classes - Car, Wheel, Engine
        // + 2.1 Add properties
        // + 2.2 Add methods  
        // + 3. Create instances of Car, wheel and engine and will play around with it.

        Car myDailyCommuter = new Car();
        
        Wheel wheel1 = new Wheel();
        wheel1.setSize("17 inch");
        Wheel wheel2 = new Wheel();
        wheel2.setSize("17 inch");
        Wheel wheel3 = new Wheel();
        wheel3.setSize("17 inch");
        Wheel wheel4 = new Wheel();
        wheel4.setSize("17 inch");

        myDailyCommuter.setFrontRight(wheel1);
        myDailyCommuter.setFrontLeft(wheel2);
        myDailyCommuter.setRearRight(wheel3);
        myDailyCommuter.setRearLeft(wheel4);

        Engine powerfulV6 = new Engine();
        powerfulV6.setType("V6");
        powerfulV6.setHorsePower(400);

        myDailyCommuter.setEngine(powerfulV6);

        // First time pushing start/stop button
        myDailyCommuter.startStopCar();
        
        System.out.println(" - -- - - - - - -- - - - - -- - ");

        // second time pushing start / stop
        myDailyCommuter.startStopCar();

        myDailyCommuter.checkWheels();


        // Car to print some info about wheels, and engine
        // If it has engine I want to start the engine as



    }
}
