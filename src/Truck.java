public class Truck extends Car{
    private int load;

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }


    public Truck(String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN, int load) {
        super(brand, model, NOW, NOP, color, isElectric, VIN);
        this.load = load;
    }

    public String toString(){
        String temp = super.toString();
        String temp2 = temp.replace("car", "truck");
        return temp2;
    }
}
