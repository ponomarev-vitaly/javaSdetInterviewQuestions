public class Vehicle {
    private String VIN;
    private String brand;
    private String model;
    private int numOfWheels;
    private int numOfPassengers;
    private String color;

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

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public Vehicle(String VIN, String brand, String model, int NOW, int NOP, String color){
        this.VIN = VIN;
        this.brand = brand;
        this.model = model;
        this.numOfWheels = NOW;
        this.numOfPassengers = NOP;
        this.color = color;
    }

    public Vehicle(){

    }

    public String toString(){
        return brand + " " + model + " ( " + color + " ) has " +
                numOfPassengers + " passenger capacity. It has " + numOfWheels + " wheels. " + "The VIN number of the car is " + VIN + ". ";
    }
}
