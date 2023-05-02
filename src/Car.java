import java.io.IOException;

public class Car implements AutoCloseable {

    @Override
    public void close()  {
        System.out.println("Машина жабылып атат");
    }

    public void drive(){
        System.out.println("Машина журуп жатат");
        System.out.println(10/0);
    }
}
