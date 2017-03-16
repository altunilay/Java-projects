import java.io.*;

public class DivideByZero extends RuntimeException{

    public DivideByZero() {}
    public DivideByZero(String message) {
        super(message);
    }
}
