import java.util.Scanner;

import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SimpleTemperature {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		// choice to find celcius or farenheit
		System.out.print("Enter 1 for celcius to Farenheit"
				+"\nEnter 2 for Fareneheit to Celcius\n");
		System.out.print("Enter your choice : ");
		int choice = scanner.nextInt();
		// condition for choice 1, the output would be
		if(choice==1)
		{
			System.out.print("Temperature in Celcius = ");
			int celcius = scanner.nextInt();
			double FindFarenheit = 9.0 / 5.0 * celcius +32;
			System.out.println("Temperature in farenheit is : "+FindFarenheit);
		}
		// condition for choice 2, the output would be
		else if(choice==2)
		{
			System.out.print("Temperature in Farenheit = ");
			int farenheit = scanner.nextInt();
			double FindCelcius = (5.0 / 9.0) *(farenheit-32);
					System.out.println("Temperature in celcius is : "+FindCelcius);
		}
		// if choice is wrong, it should display error message
		else if(choice!= 1 || choice!=2)
		{
			JOptionPane.showMessageDialog(null, "Invalid Choice","Error by user Selection",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}

}
