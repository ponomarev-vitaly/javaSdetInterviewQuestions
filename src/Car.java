public class Car extends Vehicle{
    private boolean isElectric;

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }


    public Car(String VIN, String brand, String model, int NOW, int NOP, String color, boolean isElectric){
        super(VIN, brand, model, NOW, NOP, color); // Order is important.
        this.isElectric = isElectric;
    }

    public Car(){

    }
    public String toString(){
        String temp = super.toString();
        temp += "This is " + (isElectric ? " electric " : "gasoline ") + ". ";
        return temp;
    }
}
