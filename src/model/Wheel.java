package model;

public class Wheel {
    String size;
    String tireType; // e.g. winter, summer, all-season

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public void printTireDetails(){
        System.out.println("Wheel size: " + size);
    }
}
