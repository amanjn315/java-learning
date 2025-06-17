import decorator_pattern.EmojiDecorator;
import decorator_pattern.Message;
import decorator_pattern.PlainMessage;
import decorator_pattern.TimestampDecorator;
import decorator_pattern.UppercaseDecorator;
import pkg.Student;
import vehicle_system.Electric;
import vehicle_system.ElectricCar;

public class Main {
    public static void main(String[] args){
        // ElectricCar tesla = new ElectricCar("Tesla Model 3");
        // tesla.start();
        // tesla.fuelType();
        // tesla.chargeBattery();

        Message message = new PlainMessage("Hello Aman");

        Message styled = new EmojiDecorator(
            new TimestampDecorator(
                new UppercaseDecorator(message)
            )
        );
        System.out.println(styled.format());
    }
}
