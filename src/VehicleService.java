import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleService extends VehicleAbstractClass{

    static Scanner input = new Scanner(System.in);
    static String vehicleType;

    static List<Vehicle> plainList = new ArrayList<>();
    static List<Vehicle> boatList = new ArrayList<>();
    static List<Vehicle> truckList = new ArrayList<>();
    static List<Vehicle> carList = new ArrayList<>();

    //these are console color codes
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    @Override
    public void mainMenu() {
        System.out.println(R + "**********************************    " + Y + " \nVEHICLE ADMINISTRATION PANEL\n" + G + "**********************************");
        System.out.println(B + "1- CAR operations\n2- Truck operations\n" +
                "3- Plain operations\n4- Boat operations\nQ- exit ");
        System.out.print("Please enter the action you want to do : ");
        String choice = input.next().toUpperCase();
        switch (choice) {
            case "1":
                vehicleType = "CAR";
                crudMenu();
                break;
            case "2":
                vehicleType = "TRUCK";
                crudMenu();
                break;
            case "3":
                vehicleType = "PLAIN";
                crudMenu();
                break;
            case "4":
                vehicleType = "BOAT";
                crudMenu();
                break;
            case "Q":
            //    exit();
                break;
            default:
                System.out.println("You entered incorrectly  :(");
                mainMenu();
                //You can work this case in a separate method and call it from here.
                break;


        }


    }
    @Override
    public void crudMenu() {
        System.out.println("Vehicle type of your choice: " + vehicleType + ", Please choose from the operations below.\n"
                + R + "*********** " + vehicleType + " operations ************\n" + B + " 1-create\n 2-read\n 3-update\n 4-delete\n 5-list by type\n 0-main manu");
        System.out.print(B + "Your operation Preference : ");

        System.out.print("enter your preference : ");
        int selectedOperation = input.nextInt();

        switch (selectedOperation) {
            case 1:
                createVehicle();
                mainMenu();
                break;
            case 2:
            //    read();
                mainMenu();
                break;
            case 3:
            //    update();
                mainMenu();
                break;
            case 4:
                deleteVehicle();
                mainMenu();
                break;
            case 5:
                getVehicleByType();
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("you made a wrong key, try again");
                /*
                i used google translate
                    did it translate well
                 */
                crudMenu();
                break;
        }

    }
    @Override
    public void deleteVehicle() {
        System.out.println(R+"   ***   " + vehicleType + " delete page   ***"+B);
        boolean flag = true; //created to know if there is data to delete

        if (vehicleType.equalsIgnoreCase("CAR")){//ogrenci arıyorsa if body çalışacak
         //   scan.nextLine();//dummy
            for (int i = 0; i < carList.size() ; i++) {
                System.out.println(carList.get(i).getVIN());
            }
            System.out.println("Please enter the VIN number you want to delete. ");
            String vinNumber = input.next();

            for (Vehicle v : carList) {
                if (v.getVIN().equals(vinNumber)){
                    System.out.println("deleted  : "+vehicleType +" " +v.getVIN()+" "+v.getBrand()+" "+v.getModel());
                    carList.remove(v);
                    flag = false;
                    break;
                }

            }
            if (flag){
                System.out.println("car to be deleted does not exist 404");
            }
        } else if (vehicleType.equals("TRUCK")) {


        }else if (vehicleType.equals("PLAIN")) {


        }else if (vehicleType.equals("BOAT")) {


        }


    }

    @Override
    void getVehicleByType() {
        // Solution 1.
        if(vehicleType.equals("CAR")){
            for (Vehicle w: carList
            ) {
                System.out.println(w);
            }
        }
        // Solution 2.
//        System.out.println("List of all vehicles: ");
//        VehicleApp.listAll();
    }

    @Override
    void getVehicleByBrand() {

    }

    private static void createVehicle() {
        System.out.println(R+"   ***   " + vehicleType + " create page   ***"+B);

        System.out.print("Enter the brand ...> ");
        String brand = input.next();
        System.out.print("Enter the model ...> ");
        String model = input.next();
        System.out.print("Enter number of wheels ...> ");
        int NOW = input.nextInt();
        System.out.print("Passengers cap. ...> ");
        int NOP = input.nextInt();
        System.out.print("Enter the color ...> ");
        String color = input.next();

        System.out.print("Enter the VIN ...> ");
        String VIN = input.next();

        if (vehicleType.equals("CAR")) {
            System.out.print("(E) Electric (X) Gasoline ...> ");
            String gas = input.next();
            boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;

            Car temp = new Car(VIN, brand, model, NOW, NOP, color, electric);

            System.out.println("temp = " + temp);
            carList.add(temp);

        } else if (vehicleType.equals("TRUCK")) {
         
            
            
        }else if (vehicleType.equals("PLAIN")) {
            
//           Plane temp =new Plane();
//           plainList.add(temp);
        }
        else if (vehicleType.equals("BOAT")) {

//            Boat temp=new Boat();
//            boatList.add(temp);
        }
    }
}