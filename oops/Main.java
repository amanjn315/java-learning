import pkg.Student;
import vehicle_system.Electric;
import vehicle_system.ElectricCar;

public class Main {
    public static void main(String[] args){
        ElectricCar tesla = new ElectricCar("Tesla Model 3");
        tesla.start();
        tesla.fuelType();
        tesla.chargeBattery();
    }
}
