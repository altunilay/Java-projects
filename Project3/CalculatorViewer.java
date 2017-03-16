
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorViewer extends JFrame  {

	public static void main(String[] args) {
		Calculator frame =  new Calculator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Nilay's Calculator");
		frame.setVisible(true);
        
        frame.addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.writeLog();
                System.exit(0);
            }
        } );
        
	}

}
