package vehicle_system;

public class ElectricCar extends Vehicle implements Electric {
    
    public ElectricCar(String name){
        super(name);
    }

    @Override
    public void start(){
        System.out.println(name + " is starting silently...");
    }

    @Override
    public void chargeBattery(){
        System.out.println(name + " battery is charging.");
    }
}
