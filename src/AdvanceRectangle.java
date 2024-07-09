import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.GridLayout;
import javax.swing.JTextField;
public class AdvanceRectangle {

	public static void main(String[] args) 
	
	{

		// First we have to create frame
		JFrame frame = new JFrame();
		frame.setSize(400,300);
		frame.setTitle("Rectangle");
		frame.setVisible(true);
		// we created container to place objects
		Container pane = frame.getContentPane();
		// we set gridLayout for total number of objects top to button and left to right
		pane.setLayout(new GridLayout(5,2));
		frame.getContentPane().setBackground(Color.magenta);
		// JLabel is name of objects
		JLabel lengthL = new JLabel("Length :",SwingConstants.RIGHT);
		JLabel widthL = new JLabel("Widt:  : ",SwingConstants.RIGHT);
		JLabel areaL = new JLabel("Area : ",SwingConstants.RIGHT);
		JLabel perimeterL = new JLabel("Perimeter : ",SwingConstants.RIGHT);
		// JTextField provide us space to write data or values
		// we use final to use it in action listener
		final JTextField lengthTF = new JTextField(10);
		lengthTF.setBackground(Color.cyan);
		final JTextField widthTF = new JTextField(10);
		widthTF.setBackground(Color.cyan);
		final JTextField areaTF = new JTextField(10);
		areaTF.setBackground(Color.cyan);
		final JTextField perimeterTF = new JTextField(10);
		perimeterTF.setBackground(Color.cyan);
		// its time to place objects in container
		pane.add(lengthL);
		pane.add(lengthTF);
		pane.add(widthL);
		pane.add(widthTF);
		pane.add(areaL);
		pane.add(areaTF);
		pane.add(perimeterL);
		pane.add(perimeterTF);
		// we create button calculate and exit
		JButton calculate = new JButton("CALCULATE");
		JButton exit = new JButton("Exit");
		pane.add(calculate);
		pane.add(exit);
		/* we use action Listener for calculate so that after clicking on calculate, it must display us results in area and perimeter box*/
		calculate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				double length,width,area,perimeter;
				length = Double.parseDouble(lengthTF.getText());
				width = Double.parseDouble(widthTF.getText());
				area = length * width;
				perimeter = 2 * ( length + width );
				areaTF.setText(""+area);
				perimeterTF.setText(""+perimeter);
				
			}
		});
		// exit is to terminate the program
		exit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
				
			}
		});
		
	}

}
