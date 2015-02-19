package calculator;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
	// Declare all the calculator's components
	JPanel windowContent;
	JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JPanel p1;
	
	// Constructor creates the components
	// and adds them to the frame using combination
	// of BorderLayout and GridLayout
	
	Calculator() {
		
		windowContent = new JPanel();
		
		// set the layout manager for this panel
		BorderLayout b1 = new BorderLayout();
		windowContent.setLayout(b1);
		
		// Create the display field and place it in the North area of the window
		displayField = new JTextField(30);
		windowContent.add("North", displayField);
		
		// Create buttons using the constructor of the class
		// JButton that takes the label of the button as a parameter
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
		
		// Create a panel with the GridLayout with 12 buttons
		// 10 numeric ones and the equal sign
		p1 = new JPanel();
		GridLayout g1 = new GridLayout(4,3);
		p1.setLayout(g1);
		
		// Add window controls to the panel p1
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
		p1.add(button6);
		p1.add(button7);
		p1.add(button8);
		p1.add(button9);
		p1.add(button0);
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		
		// Add the panel p1 to the center of the window
		windowContent.add("Center", p1);
		
		// Create the frame and set its content name
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		
		// Set the size of the window big enough to accommodate all controls
		frame.pack();
		
		// Display the window
		frame.setVisible(true);
		
		CalculatorEngine calcEngine = new CalculatorEngine();
		button0.addActionListener(calcEngine);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);
		button5.addActionListener(calcEngine);
		button6.addActionListener(calcEngine);
		button7.addActionListener(calcEngine);
		button8.addActionListener(calcEngine);
		button9.addActionListener(calcEngine);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}
}
