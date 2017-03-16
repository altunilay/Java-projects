import java.io.*;

public class NoOperand extends RuntimeException{

    public NoOperand() {}
    public NoOperand(String message) {
        super(message);
    }
}
