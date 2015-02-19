package calculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorEngine implements ActionListener {
	
	public void actionPerformed(ActionEvent evt) {
		
		JTextField myDisplayField = null;
		JButton clickedButton =null;
		
		// Get the source of this action
		Object eventSource = evt.getSource();
		
		if (eventSource instanceof JButton) {
			clickedButton = (JButton) eventSource;
		}else if (eventSource instanceof JTextField){
			myDisplayField = (JTextField) eventSource;
			
		}
		
		// Get the button's label
		String clickedButtonLabel = clickedButton.getText();
		
		// Concatenate the button's label to the text of the message box
		JOptionPane.showConfirmDialog(null, "You pressed " + clickedButtonLabel,
											"Just a test",
											JOptionPane.PLAIN_MESSAGE);
	}
}
