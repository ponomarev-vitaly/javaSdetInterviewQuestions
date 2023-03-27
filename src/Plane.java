public class Plane extends Vehicle{
    private int load;
    //instance variables can be duplicated


    public Plane(String VIN, String brand, String model, int numOfWheels, int numOfPassengers, String color, int load) {
        super(VIN, brand, model, numOfWheels, numOfPassengers, color);
        this.load = load;

    }


    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "load=" + load +
                '}'+ super.toString();
    }
}
