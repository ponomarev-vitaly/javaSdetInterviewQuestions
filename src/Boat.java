public class Boat extends Vehicle{
    private String name;
    private float length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Boat(String VIN, String brand, String model, int NOW, int NOP, String color, String name, float length) {
        super(VIN, brand, model, NOW, NOP, color);
        this.name = name;
        this.length = length;
    }

    public Boat(){

    }

    public String toString(){
        String temp = super.toString();
        temp += "The boat name is " + name + " and the length of the boat is " + length + ". ";
        String temp2 = temp.replace("car", "boat");
        return temp2;
    }
}
