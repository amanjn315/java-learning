public class Car {
    String model;
    int year;
    
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
