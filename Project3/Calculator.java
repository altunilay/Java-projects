

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import javax.swing.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.util.ArrayList;


public class Calculator extends JFrame {
    
	JPanel buttonPanel;
	JFrame frame;
    
	private double lastValue;
	private String lastOperator;
	private boolean startNewValue;
    private double memory=0;
    public boolean digitCalled=false;
    
    private JLabel showValue;
	private JMenuBar CalculatorMenuBar;
	private JMenuItem fileReset,fileExit,about;
	private JMenu file,help;
	private JPopupMenu popup;
    
    PrintWriter writer;
    public ArrayList<String> list = new ArrayList<String>();
    
    static int counter=1;
  
	public Calculator(){
		createCalculatorMenuBar();
		showValue = new JLabel("0");
        showValue.setPreferredSize(new Dimension(50, 75));
        showValue.setFont(new Font(showValue.getFont().getName(), showValue.getFont().getStyle(), 20));
        showValue.setBorder(new LineBorder(Color.BLACK));
		add(showValue, BorderLayout.NORTH);
        lastValue = 0;
		lastOperator = "="; 
		startNewValue = true;
      
	}
    
    public void writeLog(){
        try{
            writer=new PrintWriter("log.txt");
        }
        catch(FileNotFoundException e){
            
        }
        for (String l: list) {
            writer.println(l);
        }
        writer.close();
    }
    
	private void createButtonPanel() {
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1));
        
        buttonPanel.add(makeOperatorButton("MC"));
        buttonPanel.add(makeOperatorButton("M+"));
        buttonPanel.add(makeOperatorButton("M-"));
        buttonPanel.add(makeNumberButton("MR"));
        buttonPanel.add(makeOperatorButton("MS"));
        
        buttonPanel.add(makeNumberButton("7"));
        buttonPanel.add(makeNumberButton("8"));
        buttonPanel.add(makeNumberButton("9"));
        buttonPanel.add(makeOperatorButton("/"));
        buttonPanel.add(makeOperatorButton("sqrt"));
        
        buttonPanel.add(makeNumberButton("4"));
        buttonPanel.add(makeNumberButton("5"));
        buttonPanel.add(makeNumberButton("6"));
        buttonPanel.add(makeOperatorButton("*"));
        buttonPanel.add(makeOperatorButton("pow"));
        
        buttonPanel.add(makeNumberButton("1"));
        buttonPanel.add(makeNumberButton("2"));
        buttonPanel.add(makeNumberButton("3"));
        buttonPanel.add(makeOperatorButton("­"));
        buttonPanel.add(makeOperatorButton("C"));
       
        
        buttonPanel.add(makeNumberButton("0"));
        buttonPanel.add(makeNumberButton("."));
        buttonPanel.add(makeOperatorButton("="));
        buttonPanel.add(makeOperatorButton("+"));
        buttonPanel.add(makeNumberButton("CL"));
        
        setSize(400, 500);
		
		add(buttonPanel, BorderLayout.CENTER);
	}
	public double calculateNumbers(double value1, double value2, String op){
        
        if (op.equals("+")){
            return value1 + value2;
        }
        else if (op.equals("­")){
            return value1-value2;
        }
        else if (op.equals("*")){
            return value1 * value2;
        }
        else if (op.equals("/")){
            if(value2==0){
                throw new DivideByZero("DivideByZero Exception!");
            }
            return value1 / value2;
        }
        else if (op.equals("pow")){
            return Math.pow(value1, value2);
        }
        else{
            return value2;
        }
	}
    
	public JButton makeOperatorButton(String op) {
        
		JButton button = new JButton(op);
		ActionListener listener = new OperatorButtonListener(op); 
		button.addActionListener(listener);
		return button;
    }
    
	public JButton makeNumberButton(String number) {
        
		JButton button = new JButton(number);  
		ActionListener listener = new DigitButtonListener(number);
		button.addActionListener(listener); 
		return button;  
    }
    
	class DigitButtonListener implements ActionListener {
		private String number;
		
		public DigitButtonListener(String aNumber) {
			number = aNumber;
            
			}
		public void actionPerformed(ActionEvent event) {
			if (startNewValue) {
				showValue.setText("");
				startNewValue = false;
				}
            else{
                
            }
            digitCalled=true;
            if(number.equals("MR")){
                showValue.setText(showValue.getText() + memory);
            }
            else if(number.equals("CL")){
                try{
                list.clear();
                writeLog();
                writer.close();
                    System.out.println("Log file cleared! ");
                }
                catch(NullPointerException e){
                    
                }
            }
            
            else{
                showValue.setText(showValue.getText() + number);
            }
        }
	}
    
	class OperatorButtonListener implements ActionListener {
		private String operator;
       
		public OperatorButtonListener(String anOperator) {

			operator = anOperator; }
        
		public void actionPerformed(ActionEvent event) {
            if(digitCalled){
                
            }
            else{
                throw new NoOperand("NoOperand Exception!");
            }
			if (!startNewValue) {
                
                String text=showValue.getText();
                
                double value=Double.parseDouble(text);
                
                list.add(String.valueOf(value));
                list.add(operator);
                
                   if (operator.equals("sqrt")) {
                       if(value<0){
                           throw new SquareRootofNegativeNumber("SquareRootofNegativeNumber Exception!");
                       }
                        lastValue = Math.sqrt(value);
                        showValue.setText("" + lastValue);
                        startNewValue = false;
                    }
                
                    else if (operator.equals("C")) {
                        lastValue = 0;
                        lastOperator = "=";
                        showValue.setText("0");
                        startNewValue = true;
                        digitCalled=false;
                    }
                    else if (operator.equals("M+")) {
                        memory = memory+value;
                        lastOperator = "=";
                        startNewValue = true;
                    }
                    else if (operator.equals("M-")) {
                        memory = memory-value;
                        lastOperator = "=";
                        startNewValue = true;
                    }
                    else if (operator.equals("MC")) {
                        memory=0;
                        lastOperator = "=";
                        showValue.setText("0");
                        startNewValue = true;
                    }
                
                    else if (operator.equals("MS")) {
                        memory=value;
                        lastOperator = "=";
                        startNewValue = true;
                    }
					else {
                        lastValue=calculateNumbers(lastValue, value, lastOperator);
                        list.add(String.valueOf(lastValue));
                        showValue.setText("" + lastValue);
						startNewValue = true;
						if(operator.equals("=")) {
							showValue.setText("" + lastValue);
							startNewValue = false;
						}
                    }
            }
			lastOperator = operator;
        }
	}
	
	public void createCalculatorMenuBar () { //creates menu bar
		CalculatorMenuBar = new JMenuBar();
		setJMenuBar(CalculatorMenuBar); 

		file = new JMenu("File");
		CalculatorMenuBar.add(file);
		fileReset = new JMenuItem("Reset");
		fileReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				showValue.setText("0");
				lastValue = 0; 
				lastOperator = "="; 
				startNewValue = true;
				createButtonPanel();
				validate();
				repaint();
			}
		});
		
		fileExit = new JMenuItem("Exit");
		fileExit.addActionListener(new ActionListener() {//exits the calculator
			public void actionPerformed(ActionEvent event) {
                writeLog();
                System.exit(0);
                
            }
		}
		);
		file.add(fileReset);
		file.add(fileExit);
		
		help = new JMenu("Help");
		CalculatorMenuBar.add(help);
		about = new JMenuItem("About");
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) { //shows to popup menu for information
				 JOptionPane.showMessageDialog(frame, "Created by Nilay Altun");
			}
		});
		popup = new JPopupMenu();
		popup.add(about);
		
		help.add(about);
		
		createButtonPanel();
		}
}
