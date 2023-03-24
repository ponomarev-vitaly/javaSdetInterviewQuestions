public class Plane extends Vehicle{
    private String engineType;
    private int numberOfWings;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public Plane(String VIN, String brand, String model, int NOW, int NOP, String color, String engineType, int numberOfWings) {
        super(VIN, brand, model, NOW, NOP, color);
        this.engineType = engineType;
        this.numberOfWings = numberOfWings;
    }

    public Plane(){

    }

    public String toString(){
        String temp = super.toString();
        temp += "The plane has " + engineType + " engine and has number of " + numberOfWings + " wings. ";
        String temp2 = temp.replace("car", "plane");
        return temp2;
    }
}
