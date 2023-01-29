package model;

public class Car {
    String brand;
    String color;
    Wheel frontRight;
    Wheel frontLeft;
    Wheel rearRight;
    Wheel rearLeft;
    Wheel spare;
    Engine engine;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wheel getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(Wheel frontRight) {
        this.frontRight = frontRight;
    }

    public Wheel getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(Wheel frontLeft) {
        this.frontLeft = frontLeft;
    }

    public Wheel getRearRight() {
        return rearRight;
    }

    public void setRearRight(Wheel rearRight) {
        this.rearRight = rearRight;
    }

    public Wheel getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(Wheel rearLeft) {
        this.rearLeft = rearLeft;
    }

    public Wheel getSpare() {
        return spare;
    }

    public void setSpare(Wheel spare) {
        this.spare = spare;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startStopCar() {
        if (engine == null) {
            System.out.println("Oops, you cannot start a car without an engine.");
            System.out.println("You see a lot of red lights on your dash.");
            return; // finish line
        }

        engine.startStopEngine();
    }

    public void checkWheels() {
        if (frontRight == null) {
            System.out.println("You are missing front right wheel.");
        } else {
            frontRight.printTireDetails();
        }

        if (frontLeft == null) {
            System.out.println("You are missing front left wheel.");
        } else {
            frontLeft.printTireDetails();
        }

        if (rearRight == null) {
            System.out.println("You are missing rear right wheel.");
        } else {
            rearRight.printTireDetails();
        }

        if (rearLeft == null) {
            System.out.println("You are missing rear left wheel.");
        } else {
            rearLeft.printTireDetails();
        }

        if (spare == null) {
            System.out.println("You are missing spare wheel.");
        } else {
            spare.printTireDetails();
        }

    }

}
