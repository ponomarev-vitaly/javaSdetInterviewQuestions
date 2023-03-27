public class Truck extends Vehicle{
    private int load;
    private boolean isElectric;

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }


    public Truck(String VIN,String brand, String model, int NOW, int NOP, String color, boolean isElectric,  int load) {
        super(VIN,brand, model, NOW, NOP, color);
        this.isElectric=isElectric;
        this.load = load;
    }

//    public String toString(){
//        String temp = super.toString();
//        String temp2 = temp.replace("car", "truck");
//        return temp2;
//    }

    @Override
    public String toString() {
        return "Truck{" +
                "load=" + load +
                ", isElectric=" + isElectric +
                '}'+ super.toString();
    }
}
