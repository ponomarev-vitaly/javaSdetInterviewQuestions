public abstract class VehicleAbstractClass {
    // First define to do methods. After we defined, we go in child/concrete classes and implement abstract methods there.
    abstract void mainMenu(); // We don't have to write: public access modif., because it's public already.
    abstract void crudMenu();
    abstract void deleteVehicle();

    abstract void getVehicleByType();
    abstract void getVehicleByBrand();
}
