import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {
    static Scanner scan = new Scanner(System.in);
    static List  < Vehicle >  vehicles = new ArrayList<>();
    // We create static object from VehicleService class. Now we can reach it where we need this object.
    static VehicleService object = new VehicleService(); // We use object to reach up getVehicleByType method, because it's public, not static.

    // The name of the constructor in this line is after equals sign.

    static {
        Vehicle temp = new Vehicle("12w", "tesla", "m3",
                4, 4, "red");
        VehicleApp.vehicles.add(temp);
    }

    public static void main(String[] args) {
        mainMenu();

        // scan.next(); // To call the Scanner object class from the main method there's another option: create an object, call the method.
        int option = -1;

        while (option != 0) {
            option = mainMenu();
            switch (option) {
                case 1:
                    addCar();
                    break;
                case 2:
                    addTruck();
                    break;
                case 5:
                    listAll();
                    break;
                case 6:
                    object.getVehicleByType();
                    break;
                case 8:
                    removeVehicle();
                    break;
            }
            for (Vehicle v : vehicles) {
                v.toString();
            }
        }
    }

    public static int mainMenu() {
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

    public static void addCar() {
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

     //   Car temp = new Car(VIN, brand, model, NOW, NOP, color, electric);
        Vehicle temp = new Vehicle(VIN, brand, model, NOW,
                NOP, color);
        System.out.println("temp = " + temp);
        vehicles.add(temp);
    }

    public static void addTruck() {
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
        System.out.println("Enter the Load ...> ");
        int load = scan.nextInt();

        Truck temp = new Truck(VIN, brand, model, NOW, NOP, color, electric, load);
        vehicles.add(temp);
    }

    public static void listAll() {
        int counter = 1;
        for (Vehicle v : vehicles) {
            System.out.println((counter++) + " -> " + v.toString());
        }
    }

    public static void removeVehicle() { // We should apply to the unique number - like VIN.

        for (int i = 0; i < vehicles.size() ; i++) {
            System.out.println(vehicles.get(i).getVIN());
        }
        System.out.println("Please enter the VIN number you want to delete. ");
        String vinNumber = scan.next();
        boolean flag = false;

        for (int i = 0; i <vehicles.size() ; i++) {

            System.out.println(vehicles.get(i).getVIN().equals(vinNumber));

            if (vehicles.get(i).getVIN().equals(vinNumber)){
                System.out.println(vehicles.get(i));
                System.out.println("this car was deleted");
                flag=true;
                vehicles.remove(i);
            }
        }
    }
}