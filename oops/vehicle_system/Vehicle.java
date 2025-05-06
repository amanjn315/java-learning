package vehicle_system;

public abstract class Vehicle {
    String name;
    
    Vehicle(String name){
        this.name = name;
    }

    abstract void start();
    
    public void fuelType(){
        System.out.println(name + " uses electric power.");
    }
}
