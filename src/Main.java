import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try(Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
