import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {
    static Scanner scan = new Scanner(System.in);
    static List<Vehicle> vehicles = new ArrayList<>(); // The name of the constructor in this line is after equals sign.

    static {
        Vehicle vehicle = new Vehicle("12345678", "Ford", "Mustang", 4, 4, "black");
        vehicles.add(vehicle);
    }
    public static void main(String[] args) {
        // scan.next(); // To call the Scanner object class from the main method there's another option: create an object, call the method.
        int option = -1;

        while(option != 0){
            option = mainMenu();
            switch (option){
                case 1:
                    addCar();
                    break;
                case 2:
                    addTruck();
                    break;
                case 3:
                    addBoat();
                    break;
                case 4:
                    addPlane();
                    break;
                case 5:
                    listAll();
                    break;
                case 8:
                    removeVehicle();
                    break;
            }
            for(Vehicle v: vehicles){
                v.toString();
            }
        }
    }

    public static int mainMenu(){
        int input = 0;
        System.out.println("-----------------MAIN MENU----------------");
        System.out.println("1. Add Car");
        System.out.println("2. Add Truck");
        System.out.println("3. Add Boat");
        System.out.println("4. Add Plane");
        System.out.println("5. List All");
        System.out.println("6. List By Type");
        System.out.println("7. List By Brand");
        System.out.println("8. Remove Vehicle");
        System.out.println("0. EXIT");
        System.out.println("-------------------------------------------");
        input = scan.nextInt();
        return input;
    }

    public static void addCar(){
        // String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN
        System.out.print("Enter the brand ...> ");
        String brand = scan.next();
        System.out.print("Enter the model ...> ");
        String model = scan.next();
        System.out.print("Enter number of wheels ...> ");
        int NOW = scan.nextInt();
        System.out.print("Passengers cap. ...> ");
        int NOP = scan.nextInt();
        System.out.print("Enter the color ...> ");
        String color = scan.next();
        System.out.print("(E) Electric (X) Gasoline ...> ");
        String gas = scan.next();
        boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;
        System.out.print("Enter the VIN ...> ");
        String VIN = scan.next();

        Vehicle temp = new Vehicle(VIN, brand, model, NOW, NOP, color);
        vehicles.add(temp);
    }

    public static void addTruck(){
        // String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN
        System.out.print("Enter the brand ...> ");
        String brand = scan.next();
        System.out.print("Enter the model ...> ");
        String model = scan.next();
        System.out.print("Enter number of wheels ...> ");
        int NOW = scan.nextInt();
        System.out.print("Passengers cap. ...> ");
        int NOP = scan.nextInt();
        System.out.print("Enter the color ...> ");
        String color = scan.next();
        System.out.print("(E) Electric (X) Gasoline ...> ");
        String gas = scan.next();
        boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;
        System.out.print("Enter the VIN ...> ");
        String VIN = scan.next();
        System.out.print("Enter the Load ...> ");
        int load = scan.nextInt();

        Vehicle temp = new Vehicle(VIN, brand, model, NOW, NOP, color);
        vehicles.add(temp);
    }

    public static void addBoat(){
        System.out.print("Enter the brand ...> ");
        String brand = scan.next();
        System.out.print("Enter the model ...> ");
        String model = scan.next();
        System.out.print("Enter number of wheels ...> ");
        int NOW = scan.nextInt();
        System.out.print("Passengers cap. ...> ");
        int NOP = scan.nextInt();
        System.out.print("Enter the color ...> ");
        String color = scan.next();
        System.out.print("Enter the VIN ...> ");
        String VIN = scan.next();
        System.out.print("Enter the name of the boat ...> ");
        String name = scan.next();
        System.out.print("Enter the length of the boat ...> ");
        float length = scan.nextFloat();

        Vehicle temp = new Boat(VIN, brand, model, NOW, NOP, color, name, length);
        vehicles.add(temp);
    }

    public static void addPlane(){
        System.out.print("Enter the brand ...> ");
        String brand = scan.next();
        System.out.print("Enter the model ...> ");
        String model = scan.next();
        System.out.print("Enter number of wheels ...> ");
        int NOW = scan.nextInt();
        System.out.print("Passengers cap. ...> ");
        int NOP = scan.nextInt();
        System.out.print("Enter the color ...> ");
        String color = scan.next();
        System.out.print("Enter the VIN ...> ");
        String VIN = scan.next();
        System.out.print("Enter the engine type ...> ");
        String engineType = scan.next();
        System.out.print("Enter number of wings ...> ");
        int numberOfWings = scan.nextInt();

        Vehicle temp = new Plane(VIN, brand, model, NOW, NOP, color, engineType, numberOfWings);
        vehicles.add(temp);
    }

    public static  void listAll(){
        int counter = 1;
        for(Vehicle v : vehicles){
            System.out.println((counter++) + " -> " + v.toString() );
        }
    }

    public static boolean removeVehicle(){ // We should apply to the unique number - like VIN.
        boolean flag = false;
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).getVIN()); // We display all the VIN numbers we have.
            // i is an object of vehicles.
        }
            System.out.println("Please enter the VIN number you want to delete. ");
            String vinRemove = scan.next();
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).getVIN().equals(vinRemove));
            if(vehicles.get(i).getVIN().equals(vinRemove)){
                System.out.println(vehicles.get(i)); // User will see the data he wants remove.
                System.out.println("This " + vehicles.get(i).getBrand() + " " + vehicles.get(i).getModel() + " car was deleted!");
                vehicles.remove(i);
                flag = true;
            }
        }


        return flag;
    }
}
