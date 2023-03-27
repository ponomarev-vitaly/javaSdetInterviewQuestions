public class Vehicle {

    private String VIN;
    private String brand;
    private String model;
    private int numOfWheels;
    private int numOfPassengers;
    private String color;

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
    /*
    It should not be changed as it is a unique value.
     */

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(String VIN, String brand, String model,
                   int numOfWheels, int numOfPassengers, String color) {
        this.VIN = VIN;
        this.brand = brand;
        this.model = model;
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.color = color;
    }

    public Vehicle(){

    }

    public String toString(){
        return brand + " " + model + " ( " + color + " ) has " +
                numOfPassengers + " passenger capacity. It has " + numOfWheels + " wheels.  It's VIN number is  " +VIN + ".";
    }
}
