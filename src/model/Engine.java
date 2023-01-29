package model;

public class Engine {
    int horsePower;
    String type;
    boolean isRunning; // default value for isRunning would be false (Java basics)

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void startStopEngine() {
        if (isRunning) {
            System.out.println("Let's turn off the engine.......");
            System.out.println("Engine stopped.......");
            isRunning = false;
        } else {
            System.out.println("Your engine started....");
            System.out.println("You are running a powerful " + horsePower + " horse power " + type + " engine.");
            System.out.println("Idle RPMs at 900.");
            isRunning = true;
        }

    }
}
