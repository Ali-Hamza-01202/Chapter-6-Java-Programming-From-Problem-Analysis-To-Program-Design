import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
// you can shortly use javax.swing.*; for above functions
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
// you can shortly use java.awt.*; for above functions
public class AdvanceTemperature {

	public static void main(String[] args) 
	{
		// creation of frame
		JFrame frame = new JFrame();
		frame.setSize(700,100);
		// title of frame
		frame.setTitle("Temperature");
		frame.setVisible(true);
		Container pane = frame.getContentPane();
		frame.getContentPane().setBackground(Color.pink);
		/*4 objects in one line*/
		pane.setLayout(new GridLayout(1,4));
		// JLabel to place objects
		JLabel celciusL = new JLabel("Celcius",SwingConstants.RIGHT);
		JLabel farenheitL = new JLabel("Farenheit",SwingConstants.RIGHT);
		// JTextField to give space to write data or values
		final JTextField celciusTF = new JTextField(10);
		celciusTF.setBackground(Color.cyan);
		final JTextField farenheitTF = new JTextField(10);
		farenheitTF.setBackground(Color.cyan);
		pane.add(celciusL);
		pane.add(celciusTF);
		pane.add(farenheitL);
		pane.add(farenheitTF);
		// celciusTF should display result in farenheit Text Field
		celciusTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				double celcius,farenheit;
				celcius = Double.parseDouble(celciusTF.getText());
				farenheit = 9.0/5.0 * celcius + 32;
				farenheitTF.setText(""+farenheit);
			}
		});
		// It should display results in celcius Text Field
		farenheitTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				double celcius,farenheit;
				farenheit = Double.parseDouble(farenheitTF.getText());
				celcius = 5.0 / 9.0 * (farenheit - 32);
				celciusTF.setText(""+celcius);
			}
		});
		
	}

}
